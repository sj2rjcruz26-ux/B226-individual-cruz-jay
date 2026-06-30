package day11.activity;

import java.util.Scanner;

public class Activity7_Cruz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num[] = new int[5];
        int sum = 0;
        int high = 0, low = 0;
        double ave;

        System.out.println("Enter 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            num[i] = input.nextInt();
        }

        high = num[0];
        low = num[0];

        System.out.println("\nYou entered: ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Index " + i + ": " + num[i]);

            sum = sum + num[i];

            if (num[i] > high) {
                high = num[i];
            }

            if (num[i] < low) {
                low = num[i];
            }
        }

        ave = (double) sum / 5;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + ave);
        System.out.println("Highest Number = " + high);
        System.out.println("Lowest Number = " + low);

        input.close();
    }
}