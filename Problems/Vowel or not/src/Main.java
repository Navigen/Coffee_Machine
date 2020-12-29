import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        String[] letters = {"a", "e", "i", "o", "u"};
        String letter = String.valueOf(ch).toLowerCase();
        return Arrays.asList(letters).contains(letter);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}