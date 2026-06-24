package day6.activity;

public class Activity3_Cruz {

    public static void main(String[] args) {

        // #2
        int age = 20;
        boolean hasValidID = true;

        if (age >= 18 && hasValidID) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }

        // #3
        boolean isWeekend = true;
        boolean isHoliday = false;

        if (isWeekend || isHoliday) {
            System.out.println("No classes today");
        } else {
            System.out.println("siga ka roland");
        }

        // #4
        int score = 85;

        String scoreResult = (score >= 75)
                ? "Passed"
                : "Failed";
        System.out.println(scoreResult);

        // #5
        int num1 = 10;
        int num2 = 25;

        int largerNumber = (num1 > num2)
                ? num1
                : num2;
        System.out.println("Larger Number: " + largerNumber);

        // #6 Strecht
        int num = 22;

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
