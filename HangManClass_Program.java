import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class HangManClass_Program {

    public static void main(String[] args) {
        new HangManClass().gW(gRR());
    }

    private static String gRR(){
        int lL = 97;
        int rL = 122;
        int tSL = 4;
        Random r = new Random();
        return  r.ints(lL, rL + 1)
                .limit(tSL)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public void gW(String wordToGuess) {
        int aaa = 0;
        Set<String> pGG = new HashSet<>();
        Scanner i = new Scanner(System.in);
        int wL = wordToGuess.length();
        char[] wTGC = wordToGuess.toCharArray();
        char[] c = wordToGuess.toCharArray();
        System.out.println("Secret word: "+wordToGuess);
        for (int index = 0; index < wL; index++) {
            c[index] = '_';
        }
        while (!String.valueOf(c).equals(wordToGuess)) {
            boolean iC = false;
            boolean iR = false;
            for (int a = 0; a < wL; a++) {
                System.out.print(c[a]);
            }
            System.out.println();
            System.out.print("Guess? ");
            String cG = i.next().substring(0, 1);
            char cGC = cG.charAt(0);
            if (pGG.contains(cG))
            {
                System.out.println("Try again. Your previous guesses: ");
                System.out.println(pGG.stream().reduce("", String::concat));
                iR = true;
            }
            pGG.add(cG);
            if (!iR) {
                int t = 0;
                for (int index = 0; index < wL; index++) {
                    if (wTGC[index] == cGC) {
                        c[index] = cGC;
                        iC = true;
                        t++;
                    }
                }
                if (iC) {
                    System.out.println("The letter " + cGC + " is in the secret word! There are " + t + " " + cGC + " 's in the word.");
                } else {
                    System.out.println("Sorry, the letter is not in the word. Your secret word: ");
                }
                System.out.println();
            }
            aaa++;
        }
        System.out.println("You guessed the entire word " + wordToGuess.toUpperCase() + "  correctly! It took you " + aaa + " attempts!");
    }

    @Override
    public String toString() {
        return "HangManClass{}";
    }
}





