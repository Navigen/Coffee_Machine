import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int companiesCount = scanner.nextInt();

        int[] revenueArray = new int[companiesCount];
        int[] taxPercentArray = new int[companiesCount];

        for (int i = 0; i < companiesCount; i++) {
            revenueArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < companiesCount; i++) {
            taxPercentArray[i] = scanner.nextInt();
        }

        System.out.println(getCompanyIndexWithMaxTax(revenueArray, taxPercentArray));
    }

    public static int getCompanyIndexWithMaxTax(int[] revenueArray, int[] taxPercentArray) {
        double maxTaxValue = 0;
        int companyIndex = 0;
        for (int i = 0; i < revenueArray.length; i++) {
            double taxValue = (double) revenueArray[i] / 100 * taxPercentArray[i];
            if (maxTaxValue < taxValue) {
                maxTaxValue = taxValue;
                companyIndex = i;
            }
        }
        return companyIndex + 1;
    }

    class Point3D {
        double x, y, z;
    }
}