import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double a;
        double b;
        double c;
        double r;
        double pi = 3.14;
        switch (figure) {
            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a * b);
                break;
            case "triangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                double p = (a + b + c) / 2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "circle":
                r = scanner.nextInt();
                System.out.println(pi * Math.pow(r, 2));
                break;
            default:
                System.out.println("Unknown figure");
                break;
        }
    }
}