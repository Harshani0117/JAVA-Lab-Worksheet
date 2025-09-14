package LW01;

import java.util.Scanner;

    public class Q02{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your full name (first middle last): ");
            String fullName = scanner.nextLine();

            String[] parts = fullName.trim().split("\\s+");

            if (parts.length != 3) {
                System.out.println("Please enter valid format");
            } else {
                String first = parts[0];
                String middle = parts[1];
                String last= parts[2];

                char middleInitial = middle.charAt(0);


                System.out.println(last + ", " + first + " " + middleInitial + ".");
            }

            scanner.close();
        }
    }


