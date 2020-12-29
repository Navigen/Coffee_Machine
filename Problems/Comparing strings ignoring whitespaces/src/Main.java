import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine().trim().toLowerCase().replaceAll(" ", "");
        String secondString = scanner.nextLine().trim().toLowerCase().replaceAll(" ", "");
        System.out.println(firstString.equals(secondString));
    }
}