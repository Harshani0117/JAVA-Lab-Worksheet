package LW04;

import java.util.Scanner;

public class Q07 {

    public static int countDigits(int number) {
        int count = 0;

        if (number == 0)
            return 1;

        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        while (true) {
            int num = sc.nextInt();

               if (num < 0) {
                break;
            }
            System.out.println(countDigits(num));
        }
        sc.close();
    }
}
