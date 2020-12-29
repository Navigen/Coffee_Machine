import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        int i = 1;
        while (true) {
            result = i * i;
            i++;
            if (result <= n) {
                System.out.println(result);
            } else {
                break;
            }
        }
    }
}