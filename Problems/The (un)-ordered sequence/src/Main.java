import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prevNumber = 0;
        int prevPrevNumber;
        int number = 0;
        boolean isQueueCorrect = true;
        boolean isOrdered = true;
        while (true) {

            prevPrevNumber = prevNumber;
            prevNumber = number;

            if (prevNumber < prevPrevNumber && isOrdered) {
                isOrdered = false;
            }

            number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            if (prevPrevNumber == 0 && number < prevNumber) {
                isOrdered = false;
            }

            if (!isOrdered && prevNumber < number && isQueueCorrect ||
                    isOrdered && prevNumber > number) {
                isQueueCorrect = false;
            }
        }

        System.out.println(isQueueCorrect);
    }
}