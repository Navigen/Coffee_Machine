import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int sum = 0;
        do {
            value = scanner.nextInt();
            sum++;
        } while (value != 0);
        System.out.println(sum - 1);
    }
}