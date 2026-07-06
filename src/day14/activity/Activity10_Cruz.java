package day14.activity;

public class Activity10_Cruz {

    public static void main(String[] args) {

        int num = -10;
        System.out.println("Absolute Value: " + Math.abs(num));

        int a = 15;
        int b = 30;
        System.out.println("Maximum: " + Math.max(a, b));
        System.out.println("Minimum: " + Math.min(a, b));

        double base = 2;
        double exponent = 3;
        System.out.println("Power: " + Math.pow(base, exponent));

        double value = 25;
        System.out.println("Square Root: " + Math.sqrt(value));

        double decimal = 5.7;
        System.out.println("Round: " + Math.round(decimal));

        System.out.println("Ceiling: " + Math.ceil(5.2));
        System.out.println("Floor: " + Math.floor(5.9));

        System.out.println("Random Number: " + Math.random());

        System.out.println("Natural Log: " + Math.log(10));
        System.out.println("Log Base 10: " + Math.log10(100));

        System.out.println("Exponential: " + Math.exp(2));

        System.out.println("Sin(30): " + Math.sin(Math.toRadians(30)));
        System.out.println("Cos(60): " + Math.cos(Math.toRadians(60)));
        System.out.println("Tan(45): " + Math.tan(Math.toRadians(45)));
    }
}
