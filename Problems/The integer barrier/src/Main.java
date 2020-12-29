import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                System.out.println(sum);
                break;
            }
            sum += number;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}