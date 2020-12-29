import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int feetUp = scanner.nextInt();
        int feetDown = scanner.nextInt();
        int day = 1;
        int path = feetUp;
        while (height > path) {
            path = path + feetUp - feetDown;
            day++;
        }
        System.out.println(day);
    }
}