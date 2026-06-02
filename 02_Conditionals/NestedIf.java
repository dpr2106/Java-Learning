public class NestedIf {
    public static void main(String[] args) {
        double price = 9.99;
        boolean isSenior = false;
        boolean isStudent = false;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            } else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        } else {
            price *= 1;
        }

        System.out.printf("Your final price is: $%.2f", price);
    }
}
