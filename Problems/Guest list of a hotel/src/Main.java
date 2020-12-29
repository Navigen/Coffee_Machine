//put imports you need here

import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> guestsStack = new Stack<>();
        for (int i = 0; i < 8; i++) {
            guestsStack.push(scanner.next());
        }

        while (!guestsStack.empty()) {
            System.out.println(guestsStack.pop());
        }
    }
}