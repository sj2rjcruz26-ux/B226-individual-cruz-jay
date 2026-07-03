package day13.activity;
import java.util.Scanner;

public class Activity9_Cruz {

    public static void main(String[] args) {

        // contains()
        System.out.println("===== contains() =====");
        String text1 = "Hello World";
        System.out.println(text1.contains("World"));

        // endsWith()
        System.out.println("\n===== endsWith() =====");
        String file = "report.pdf";
        System.out.println(file.endsWith(".pdf"));

        // startsWith()
        System.out.println("\n===== startsWith() =====");
        String countryName = "Philippines";
        System.out.println(countryName.startsWith("Phil"));

        // indexOf()
        System.out.println("\n===== indexOf() =====");
        String word = "Programming";
        System.out.println(word.indexOf("g"));

        // isEmpty()
        System.out.println("\n===== isEmpty() =====");
        String empty = "";
        System.out.println(empty.isEmpty());

        // trim()
        System.out.println("\n===== trim() =====");
        String message = "   Java Programming   ";
        System.out.println(message.trim());

        // replace()
        System.out.println("\n===== replace() =====");
        String fruit = "banana";
        System.out.println(fruit.replace("a", "o"));

        // toCharArray()
        System.out.println("\n===== toCharArray() =====");
        String java = "JayRon";
        char[] letters = java.toCharArray();

        for (char letter : letters) {
            System.out.println(letter);
        }

        // nextLine().charAt()
        System.out.println("\n===== nextLine().charAt() =====");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        char firstLetter = sc.nextLine().charAt(0);

        System.out.println("First Letter: " + firstLetter);

        // valueOf()
        System.out.println("\n===== valueOf() =====");
        int number = 100;
        String numText = String.valueOf(number);
        System.out.println(numText);


        // Stretch Goal

        System.out.println("\n===== Stretch Goal =====");

        String country = "Philippines";

        // First and Last Character
        System.out.println("Country: " + country);
        System.out.println("First Character: " + country.charAt(0));
        System.out.println("Last Character: " + country.charAt(country.length() - 1));

        int pCount = 0;
        int vowelCount = 0;

        for (int i = 0; i < country.length(); i++) {

            char ch = country.charAt(i);

            // Count P/p
            if (ch == 'P' || ch == 'p') {
                pCount++;
            }

            // Count vowels
            char lower = Character.toLowerCase(ch);

            if (lower == 'a' || lower == 'e' || lower == 'i'
                    || lower == 'o' || lower == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of P/p: " + pCount);
        System.out.println("Total Vowels: " + vowelCount);

        sc.close();
    }
}