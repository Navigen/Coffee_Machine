import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> decrements = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            decrements.add(scanner.nextInt());
        }

        for (Integer decrement : decrements) {
            int result = decrement;
            System.out.print(--result + " ");
        }
    }
}