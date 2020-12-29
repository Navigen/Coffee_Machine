import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfUnits = scanner.nextInt();
        if (countOfUnits < 1) {
            System.out.println("no army");
        } else if (countOfUnits <= 19) {
            System.out.println("pack");
        } else if (countOfUnits <= 249) {
            System.out.println("throng");
        } else if (countOfUnits <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}