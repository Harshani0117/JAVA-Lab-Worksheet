package LW03;

import java.util.Scanner;

public class Q01 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        double celcius = scanner.nextDouble();

        Temperature temp = new Temperature(celcius);

        System.out.println(temp.getFahrenheit());
        scanner.close();
    }
}
