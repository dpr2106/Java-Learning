public class nested-if {
    public static void main (String[] args){
        //nested if :- these are statement in conditions where we can give condition in condition
        



        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }
            else{
                System.out.println("You get a student discount of 10%");
            }
        }
        else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
            else{
                price *= 1;
                System.out.println("No discount is applied");
            }
        }

        System.out.println("Your final price is: " + price);
    }
}
