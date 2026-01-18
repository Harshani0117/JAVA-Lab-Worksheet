package LW04;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        String cleaned = input.replace(" ", "").toLowerCase();
        String reversed = "";

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        if (cleaned.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}
