import java.util.Scanner;

public class temperatureconvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Welcome to the temperature conversion program!");
        System.out.print("Enter the temperature you want to convert: ");
        temp = scanner.nextDouble();

        System.out.print("Enter the unit of the temperature (C/F): ");
        unit = scanner.next();

        if (unit.equalsIgnoreCase("C")) {
            newTemp = (temp * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is: " + newTemp);
        } else if (unit.equalsIgnoreCase("F")) {
            newTemp = (temp - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is: " + newTemp);
        } else {
            System.out.println("Invalid unit. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }

        scanner.close();
    }
}
