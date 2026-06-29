package day10.discussion;

import day9.discussion.*;
import java.util.Scanner;

public class InfiniteLoop {

    public static void main(String[] args) {
        // When to use Do - While: if you must have to execute the loop at least once
        String color = "Black";
        do {
            System.out.println(color);
        } while (color.equals("White"));

// syntax for do while
//        Scanner input = new Scanner(System.in);
//        int choice;
//
//        do {
//            System.out.println("==Main Menu==");
//            System.out.println(" [1] - Start Game");
//            System.out.println(" [2] - Load Game");
//            System.out.println(" [3] - Settings");
//            System.out.println(" [4] - Exit");
//            System.out.println("Enter your choice: ");
//            choice = input.nextInt();
//        } while (choice != 4);
//
//        input.close();
        // Common Real-World Uses of Do While
        /*
            Menu-Driven programs
            User input Validation
            Repetitive Task with quaranted first run
         */
    }
}
