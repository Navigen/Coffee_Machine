import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int n = 1;
        long factorial = 1;
        while (factorial <= m) {
            n++;
            factorial = factorial * n;
        }

        System.out.println(n);
    }
}