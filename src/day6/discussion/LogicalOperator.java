package day6.discussion;

public class LogicalOperator {

    public static void main(String[] args) {

        // Cinema Logic
        boolean hasTicket = true;
        boolean hasVacinationCard = true;
        boolean isSeniorCitizen = true;
        boolean isStudent = true;
        boolean isLoggedIn = true;

        // (AND &&) May Ticket -> pwede kang pumasok sa sineha
        System.out.println("Allowed to enter cinema: " + (hasTicket && hasVacinationCard));
        // (OR ||)(student || senior citizen) -> Discounted
        System.out.println("Eligible for discount: " + (isStudent || isSeniorCitizen));
        // (NOT !) Hindi naka logged in sa app
        System.out.println("Cannot reserve seat: " + !isLoggedIn);

        //Logical &&
        /*int num = 100;
        int num2 = 200;
        
        //                   T             F
        boolean result = num < num2 && num > num2;
        
        System.out.println(result);
         */
    }
}
