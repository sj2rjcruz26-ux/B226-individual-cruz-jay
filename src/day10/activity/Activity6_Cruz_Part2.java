package day10.activity;

public class Activity6_Cruz_Part2 {
    public static void main(String[] args) {
        
        // Part 2
        System.out.println("ALL MULTIPLICATION TABLES");

        for (int table = 1; table <= 10; table++) {
            System.out.println("Multiplication Table of " + table);

            for (int i = 0; i <= 10; i++) {
                System.out.println(table + " * " + i + " = " + table * i);
            }
        }
    }
}
