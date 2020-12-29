import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < 4) {
            String inputString = scanner.nextLine();
            String[] words = inputString.split(" ");
            for (String word : words) {
                System.out.println(word);
                counter++;
            }
        }
    }
}