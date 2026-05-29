import java.util.Random;

public class random {
    public static void main(String[] args) {
        // Learning Random Class = generates random numbers.

        Random random = new Random();

        boolean isHeads;

        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("It's heads! 🪙");
        } else {
            System.out.println("It's tails! 🪙");
        }

    }
}