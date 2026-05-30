import java.util.Scanner;

public class mathsmodule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;

        System.out.println("The circumference of the circle is: " + circumference);

        scanner.close();
    }
}
// This is an test update as there was account change in the Github