package LW04;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power of 10 :");
        int power =sc.nextInt();

        switch(power){
            case 6:
                System.out.println("Million");
                break;
            case 9:
                System.out.println("Billion");
                break;
            case 12:
                System.out.println("Trillion");
                break;
            case 15:
                System.out.println("Quadrillion");
                break;
            case 18:
                System.out.println("Quintilion");
                break;
            case 21:
                System.out.println("Sextilion");
                break;
            case 30:
                System.out.println("Nonillion");
                break;
            case 100 :
                System.out.println("Googol");
                break;
            default :
                System.out.println("Invalid input");
                break;

        }

    sc.close();

    }
}
