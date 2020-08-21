import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
public class HangManClass {

    public static void main(String[] args) {
        guessWord(generateRandomWord());
    }

    private static String generateRandomWord(){
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 4;
        Random random = new Random();
        return  random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private static void guessWord(String wordToGuess) {
        int attempts = 0;
        Set<String> previousGuesses = new HashSet<>();
        Scanner input = new Scanner(System.in);
        int wordLength = wordToGuess.length();
        char[] wordToGuessChars = wordToGuess.toCharArray();
        char[] censor = wordToGuess.toCharArray();
        System.out.println("Your secret word is : "+wordToGuess);
        for (int index = 0; index < wordLength; index++) {
            censor[index] = '_';
        }
        while (!String.valueOf(censor).equals(wordToGuess)) {
            boolean isCorrect = false;
            boolean isRepeated = false;
            for (int a = 0; a < wordLength; a++) {
                System.out.print(censor[a]);
            }
            System.out.println();
            System.out.print("Type your guess: ");
            String currentGuess = input.next().substring(0, 1);
            char currentGuessCharacter = currentGuess.charAt(0);
            if (previousGuesses.contains(currentGuess))
            {
                System.out.println("You already guessed this letter! Try again. Your previous guesses were: ");
                System.out.println(previousGuesses.stream().reduce("", String::concat));
                isRepeated = true;
            }
            previousGuesses.add(currentGuess);
            if (!isRepeated) {
                int times = 0;
                for (int index = 0; index < wordLength; index++) {
                    if (wordToGuessChars[index] == currentGuessCharacter) {
                        censor[index] = currentGuessCharacter;
                        isCorrect = true;
                        times++;
                    }
                }
                if (isCorrect) {
                    System.out.println("The letter " + currentGuessCharacter + " is in the secret word! There are " + times + " " + currentGuessCharacter + " 's in the word.");
                } else {
                    System.out.println("Sorry, the letter is not in the word. Your secret word: ");
                }
                System.out.println();
            }
            attempts++;
        }
        System.out.println("You guessed the entire word " + wordToGuess.toUpperCase() + "  correctly! It took you " + attempts + " attempts!");
    }

    @Override
    public String toString() {
        return "HangManClass{}";
    }
}
