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
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area + "cm^2");
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of the sphere is: " + volume + "cm^3");

        scanner.close();
    }
}
// This is an test update as there was account change in the Github