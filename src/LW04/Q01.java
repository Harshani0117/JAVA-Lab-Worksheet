package LW04;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int smallest = a;

        if (b < a) {
            smallest = b;
        }
        if (c < a) {
            smallest = c;
        }
        System.out.println(smallest);
        sc.close();

    }
}
