package LW04;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        int number = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(number +"*"+i+"="+(number*i));
        }
        sc.close();

    }
}
