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

        System.out.print("\nThe Principal Amount you entered is: " + principal);
        System.out.print("\nThe Annual Interest Rate you entered is: " + rate);
        System.out.print("\nThe Number of times interest is compounded per year is: " + timesCompounded);
        System.out.print("\nThe Number of years you entered is: " + years);

        // Calculate compound interest
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.println("\nThe compound interest is: " + (amount - principal));
        scanner.close();
    }
}
