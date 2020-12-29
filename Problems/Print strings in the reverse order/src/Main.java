//put imports you need here

import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        int stringSize = 3;
        Scanner scanner = new Scanner(System.in);
        Stack<String> stringStack = new Stack<>();
        for (int i = 0; i < stringSize; i++) {
            stringStack.push(scanner.nextLine());
        }

        for (int i = 0; i < stringSize; i++) {
            System.out.println(stringStack.pop());
        }
    }
}