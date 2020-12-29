import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringOfNumbers = scanner.nextLine();
        String[] arrayOfNumbers = stringOfNumbers.split(" ");
        int a = Integer.parseInt(arrayOfNumbers[0]);
        int b = Integer.parseInt(arrayOfNumbers[1]);
        double mul = 1;
        for (int i = a; i < b; i++) {
            mul *= i;
        }
        System.out.printf("%.0f", mul);
    }
}