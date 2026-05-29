import java.util.Scanner;

public class mathsmodule {
    public static void main(String[] args) {
        // Learning Hypotenuse = the longest side of a right triangle via math module.
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The length of the hypotenuse of the required triangle is: " + c);

        scanner.close();
    }
}
