import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class HangManClass_Program {

    public static void main(String[] args) {
       new  HangManClass_Program().gW(gRR());
    }

    private static String gRR(){
        int lL = 97;
        int rL = 122;
        int tSL = 4;
        Random r = new Random();
        return  r.ints(lL, rL + 1)
                .limit(tSL)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString(); }

    public void gW(String wwTG) {
        int aaa = 0;
        Set<String> pGG = new HashSet<>();
        Scanner i = new Scanner(System.in);
        int wL = wwTG.length();
        char[] wTGC = wwTG.toCharArray();
        char[] c = wwTG.toCharArray();
        System.out.print("Secret word: ");
        System.out.println(wwTG);
        for (int o = 0; o < wL; o++) {
            c[o] = '_';
        }
        while (!String.valueOf(c).equals(wwTG)) {
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
                    System.out.print("The letter ");
                    System.out.print(cGC);
                    System.out.print(" is in the secret word! There are ");
                    System.out.print(t);
                    System.out.print(" ");
                    System.out.print(cGC);
                    System.out.println(" 's in the word.");
                } else {
                    System.out.println("Sorry, the letter is not in the word. Your secret word: ");
                }
                System.out.println();
            }
            aaa++;
        }
        System.out.print("You guessed the entire word ");
        System.out.print(wwTG.toUpperCase());
        System.out.print("  correctly! It took you ");
        System.out.print(aaa);
        System.out.print(" attemts!");
    }

    @Override
    public String toString() {
        return "HangManClass{}";
    }
}
