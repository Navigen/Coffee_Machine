import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        long i = 2;
        while (i <= number) {
            if (number % i == 0 && i != number) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}