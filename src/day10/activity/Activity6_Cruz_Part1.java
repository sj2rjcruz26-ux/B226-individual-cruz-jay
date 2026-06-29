package day10.activity;

import java.util.Scanner;

public class Activity6_Cruz_Part1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part 1
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Multiplication Table of " + number);
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
        input.close();
    }
}
