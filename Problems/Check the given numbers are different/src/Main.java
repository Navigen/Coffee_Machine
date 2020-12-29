import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringOfNumbers = scanner.nextLine();
        String[] arrayOfNumbers = stringOfNumbers.split(" ");
        int first = Integer.parseInt(arrayOfNumbers[0]);
        int second = Integer.parseInt(arrayOfNumbers[1]);
        int third = Integer.parseInt(arrayOfNumbers[2]);
        System.out.println(first != second && second != third && first != third);
    }
}