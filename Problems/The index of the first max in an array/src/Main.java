import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int maxValue = Integer.MIN_VALUE;
        int maxValueIndex = 0;
        for (int i = 0; i < len; i++) {
            int inputValue = scanner.nextInt();
            if (maxValue < inputValue) {
                maxValue = inputValue;
                maxValueIndex = i;
            }
        }

        System.out.println(maxValueIndex);
    }
}
