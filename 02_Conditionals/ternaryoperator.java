public class ternaryoperator {
    public static void main(String[] args) {
        int score = 70;
        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Score: " + score);
        System.out.println("Result: " + passOrFail);
    }
}
