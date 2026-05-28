import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("Enter the item name to buy: ");
        item = scanner.nextLine();
        System.out.print("Enter the price of the item: ");
        price = scanner.nextDouble();
        System.out.print("Enter the quantity: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("Item: " + item);
        System.out.println("Price: " + currency + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + currency + total);

        scanner.close();
    }
}
