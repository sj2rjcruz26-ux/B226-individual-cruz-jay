package day7.activity;

import java.util.Scanner;

public class Activity4_Cruz {

    public static void main(String[] args) {
        System.out.println("======Main Menu======");
        System.out.println("=   1 - Start Game  =");
        System.out.println("=   2 - Load Game   =");
        System.out.println("=   3 - Settings    =");
        System.out.println("=   4 - Exit        =");
        System.out.println("=====================");

        System.out.print("Enter your choice (1-4): ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (num == 1) {
            System.out.println("You selected Option 1: Start Game");
        } else if (num == 2) {
            System.out.println("You selected Option 1: Load Game");
        } else if (num == 3) {
            System.out.println("You selected Option 1: Settings");
        } else if (num == 4) {
            System.out.println("You selected Option 1: Exit");
        } else {
            System.out.println("Invalid choice. Please select a valid choice");
        }
    }
}
