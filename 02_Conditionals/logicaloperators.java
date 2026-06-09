public class logicaloperators {
    public static void main(String[] args) {
        // && (logical AND)
        // || (logical OR)
        // ! (logical NOT)

        double temp = 20;
        if (temp <= 30 && temp >= 0) {
            System.err.println("The weather is good");
        }else if (temp < 0 || temp > 30) {
            System.err.println("The weather is bad");
        }
        

        boolean issunny = true;
        if (!issunny) {
            System.out.println("It's  not sunny outside");
        } else {
            System.out.println("It's sunny outside");
        }

    }
}