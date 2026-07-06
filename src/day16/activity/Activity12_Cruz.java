package day16.activity;

import java.util.Random;

public class Activity12_Cruz {

    // 1. Identify if a number is odd or even
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }

    // 2. Print your name 50 times
    public static void printName() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". Ronald Jay Cruz");
        }
    }

    // 3. Get the square root of a variable
    public static void squareRoot(double number) {
        System.out.println("Square Root = " + Math.sqrt(number));
    }

    // 4. Get the power using base and exponent
    public static void power(double base, double exponent) {
        System.out.println("Power = " + Math.pow(base, exponent));
    }

    // 5. Print a random number between 1 and 100
    public static void randomNumber() {
        Random random = new Random();
        System.out.println("Random Number = " + (random.nextInt(100) + 1));
    }

    // 6. Get the area of a circle
    public static void areaOfCircle(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    // 7. Identify if a person is a voter
    public static void isVoter(int age) {
        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
    }

    // 8. Get the length of a word
    public static void wordLength(String word) {
        System.out.println("Length = " + word.length());
    }

    // 9. Print a word in reverse order
    public static void reverseWord(String word) {
        System.out.print("Reverse = ");
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }

    // 10. Print full name and age
    public static void personalInfo(String name, int age) {
        System.out.println("Full Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        oddOrEven(15);
        printName();
        squareRoot(81);
        power(2, 5);
        randomNumber();
        areaOfCircle(7);
        isVoter(20);
        wordLength("Programming");
        reverseWord("Programming");
        personalInfo("Ronald Jay Cruz", 21);
    }
}
