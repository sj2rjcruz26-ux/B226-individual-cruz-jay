package day19.discussion;

import java.util.Scanner;

public class ScannerBug {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your mobile number: ");
        String mobileNum = scanner.nextLine();

    }
}
