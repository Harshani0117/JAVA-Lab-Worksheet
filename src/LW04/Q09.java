package LW04;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows :");

        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int space = rows - i; space > 0; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
