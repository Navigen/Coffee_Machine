import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String inputNumbers = scanner.nextLine();
        String[] numbersInStrings = inputNumbers.split(" ");
        int firstNumber = Integer.parseInt(numbersInStrings[0]);
        int secondNumber = Integer.parseInt(numbersInStrings[1]) + 1;
        System.out.println(inputStr.substring(firstNumber, secondNumber));
    }
}