package machine;

import java.util.Scanner;

import static java.lang.System.exit;

enum CoffeeMachineState {
    CHOOSING_ACTION,
    BUY_ACTION,
    FILL_ACTION
}

public class CoffeeMachine {

    static int water = 400;
    static int milk = 540;
    static int coffee = 120;
    static int cups = 9;
    static int money = 550;
    static Scanner scanner = new Scanner(System.in);
    static int fillMenuStep = 0;
    static CoffeeMachineState coffeeMachineState = CoffeeMachineState.CHOOSING_ACTION;

    public static void main(String[] args) {
        showMainMenu();
    }

    private static void readActionFromUser() {
        executeAction(scanner.next());
    }

    private static void showMainMenu() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        coffeeMachineState = CoffeeMachineState.CHOOSING_ACTION;
        readActionFromUser();
    }

    private static void showBuyMenu() {
        coffeeMachineState = CoffeeMachineState.BUY_ACTION;
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        readActionFromUser();
    }

    private static void executeAction(String input) {
        if (coffeeMachineState == CoffeeMachineState.CHOOSING_ACTION) {
            switch (input) {
                case "buy":
                    showBuyMenu();
                    break;
                case "fill":
                    coffeeMachineState = CoffeeMachineState.FILL_ACTION;
                    fillAction("");
                    System.out.println();
                    break;
                case "take":
                    takeAction();
                    System.out.println();
                    break;
                case "remaining":
                    printStatus();
                    break;
                case "exit":
                    exit(0);
                    break;
            }
        } else if (coffeeMachineState == CoffeeMachineState.BUY_ACTION) {
            if (!"back".equals(input)) {
                makingCoffee(Integer.parseInt(input));
            }
            showMainMenu();
        } else if (coffeeMachineState == CoffeeMachineState.FILL_ACTION) {
            fillAction(input);
        }
    }

    private static boolean checkPossibilityToDoCoffee(int coffeeType) {
        if ((coffeeType == 1 && water < 250) || (coffeeType == 2 && water < 350) || (coffeeType == 3 && water < 200)) {
            System.out.println("Sorry, not enough water!\n");
            return false;
        }

        if ((coffeeType == 2 && milk < 75) || (coffeeType == 3 && milk < 100)) {
            System.out.println("Sorry, not enough milk!\n");
            return false;
        }

        if ((coffeeType == 1 && coffee < 16) || (coffeeType == 2 && coffee < 20) || (coffeeType == 3 && coffee < 12)) {
            System.out.println("Sorry, not enough coffee beans!\n");
            return false;
        }

        if (cups < 1) {
            System.out.println("Sorry, not enough cups!\n");
            return false;
        }

        System.out.println("I have enough resources, making you a coffee!");
        System.out.println();
        return true;
    }

    private static void makingCoffee(int coffeeType) {
        if (checkPossibilityToDoCoffee(coffeeType)) {
            switch (coffeeType) {
                case 1:
                    water = water - 250;
                    coffee = coffee - 16;
                    money = money + 4;
                    cups--;
                    break;
                case 2:
                    water = water - 350;
                    milk = milk - 75;
                    coffee = coffee - 20;
                    money = money + 7;
                    cups--;
                    break;
                case 3:
                    water = water - 200;
                    milk = milk - 100;
                    coffee = coffee - 12;
                    money = money + 6;
                    cups--;
                    break;
            }
        }
    }

    private static void fillAction(String input) {
        switch (fillMenuStep) {
            case 1: {
                water += Integer.parseInt(input);
                fillMenuStep++;
                System.out.println("Write how many ml of milk do you want to add:");
                readActionFromUser();
                break;
            }
            case 2: {
                milk += Integer.parseInt(input);
                fillMenuStep++;
                System.out.println("Write how many grams of coffee beans do you want to add:");
                readActionFromUser();
                break;
            }
            case 3: {
                coffee += Integer.parseInt(input);
                fillMenuStep++;
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                readActionFromUser();
                break;
            }
            case 4: {
                cups += Integer.parseInt(input);
                fillMenuStep = 0;
                System.out.println();
                showMainMenu();
                break;
            }
            case 0: {
                System.out.println("\nWrite how many ml of water do you want to add:");
                fillMenuStep++;
                readActionFromUser();
                break;
            }
        }
    }

    private static void takeAction() {
        System.out.println("\nI gave you $" + money + "\n");
        money = 0;
        showMainMenu();
    }

    private static void printStatus() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money\n");
        showMainMenu();
    }
}
