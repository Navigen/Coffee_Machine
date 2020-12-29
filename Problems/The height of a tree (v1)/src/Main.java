import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringOfNumbers = scanner.nextLine();
        String[] arrayOfNumbers = stringOfNumbers.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for(String stringNumber : arrayOfNumbers) {
            numbers.add(Integer.parseInt(stringNumber));
        }

        recursive(numbers.indexOf(-1), numbers);
    }


    public static void recursive(int number, List<Integer> numbers) {

    }
}