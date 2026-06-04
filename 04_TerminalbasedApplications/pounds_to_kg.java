import java.util.Scanner;

public class pounds_to_kg {
    public static void main(String[] args) {
        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        // welcome message

        System.out.println("Welcome to the weight conversion program!");
        System.out.println("Please select the conversion you would like to perform:");
        System.out.println("1. Pounds to Kilograms");
        System.out.println("2. Kilograms to Pounds");

        // prompt for user choice
        System.out.print("Enter your choice (1 or 2): ");
        choice = scanner.nextInt();

        // option 1 convert lbs to kgs
        if (choice == 1) {
            System.out.print("Enter weight in pounds: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Weight in kilograms: %.2f kg", newWeight);
        }
        // option 2 convert kgs to lbs
        else if (choice == 2) {
            System.out.print("Enter weight in kilograms: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Weight in pounds: %.2f lb", newWeight);
        }
        // else print invalid choice
        else {
            System.out.println("Invalid choice!");
        }
        // close scanner
        scanner.close();
    }
}
