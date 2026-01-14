package LW04;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        for (int i = 10; i <= 40; i+=10) {
            for (int j = i; j < i+10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            }
    }
}
