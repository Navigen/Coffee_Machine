import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int sec1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int sec2 = scanner.nextInt();

        int seconds1 = hour1 * 3600 + min1 * 60 + sec1;
        int seconds2 = hour2 * 3600 + min2 * 60 + sec2;
        System.out.println(seconds2 - seconds1);
    }
}