package day15.activity;

import java.util.Random;

public class Activity11_Cruz {

    public static void main(String[] args) {

        Random random = new Random();
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {

            int number;
            boolean duplicate;

            do {
                number = random.nextInt(58) + 1; // Random number from 1 to 58
                duplicate = false;

                // Check if the number already exists
                for (int j = 0; j < i; j++) {
                    if (lotto[j] == number) {
                        duplicate = true;
                        break;
                    }
                }

            } while (duplicate);

            lotto[i] = number;
        }

        System.out.println("Lotto Numbers");

        for (int num : lotto) {
            System.out.print(num + " ");
        }
    }
}
