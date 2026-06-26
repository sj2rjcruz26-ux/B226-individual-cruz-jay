package day8.discussion;

import java.util.Scanner;

public class AgeClassificationNested {

    public static void main(String[] args) {
        /*
        Age: 0 - 12 -> Child
            Age: 0 - 5 -> Specifically, Toddler
            Age: 6 - 12 -> Specifically, Pre-Teen
        Age: 13 - 19 -> Teenager
            Age: 13 - 15 -> Specifically, Early Teen
            Age: 16 - 19 -> Specifically, Late-Teen
        Age: 20 - 59 -> Adult
            Age: 20 - 35 -> Specifically, Young Adult
            Age: 36 - 59 -> Specifically, Middle-Aged
        Age: 60 - 120 -> Senior Citizen
            Age: 60 - 75 -> Specifically, Young Senior
            Age: 76 - 120 -> Specifically, Elderly
        Invalid Age -> Invalid Input
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        //Validaion
        if (age >= 0 && age <= 120) {
            if (age <= 12) { //outer if
                System.out.println("Child");
                if (age <= 5) { //Toddler - inner if
                    System.out.println("Specifically, Toddler");
                } else {
                    System.out.println("Specifically, Pre-Teen");
                }
            } else if (age <= 19) {
                System.out.println("Teenager");
                if (age <= 15) {
                    System.out.println("Specifically, Early Teen");
                } else {
                    System.out.println("Specifically, Late Teen");
                }
            } else if (age <= 59) {
                System.out.println("Adult");
                if (age <= 35) {
                    System.out.println("Specifically, Young Adult");
                } else {
                    System.out.println("Specifically, Middle Aged");
                }
            } else if (age <= 120) {
                System.out.println("Senior Citizen");
                if (age <= 75) {
                    System.out.println("Specifically, Young Senior");
                } else {
                    System.out.println("Specifically, Elderly");
                }
            }
        } else {
            System.out.println("Invalid Age Entered");
        }
        //code minimization

        input.close();
    }
}
