import java.util.Scanner;

public class compound_interset_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in decimal): ");
        rate = scanner.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        // Calculate compound interest
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.println("The compound interest is: " + (amount - principal));
        scanner.close();
    }
}
