public class mathsmodule {
    public static void main(String[] args) {
        // Learning math module = provides methods for performing basic numeric
        // operations such as elementary exponential, logarithm, square root, and
        // trigonometric functions.

        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Math.E: " + Math.E);

        int result;

        result = (int) Math.pow(2, 20);
        result = Math.abs(-5);
        result = (int) Math.sqrt(16);
        result = (int) Math.round(3.14);
        result = (int) Math.ceil(3.14);
        result = (int) Math.floor(3.99);
        result = (int) Math.max(10, 20);
        result = (int) Math.min(10, 20);

        System.out.println(result);
    }
}
