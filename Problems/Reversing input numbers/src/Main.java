import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringOfNumbers = scanner.nextLine();
        String[] arrayOfNumbers = stringOfNumbers.split(" ");
        for (int i = arrayOfNumbers.length - 1; i >= 0; i--) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
    }
}