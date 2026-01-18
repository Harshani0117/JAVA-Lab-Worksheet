package LW04;

import java.util.Scanner;
import java.util.Random;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            if (guess < number)
                System.out.println("Higher");
            else if (guess > number)
                System.out.println("Lower");
            else
                System.out.println("Correct!");

        } while (guess != number);

        sc.close();
    }
}
