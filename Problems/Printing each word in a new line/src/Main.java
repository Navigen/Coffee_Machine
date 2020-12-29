import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            stringBuilder.append(scanner.next()).append(" ");
        }
        String[] words = stringBuilder.toString().split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}