package LW03;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    double fahrenheit = sc.nextDouble();

    Temperature temp = new Temperature();
        temp.setFahrenheit(fahrenheit);

        System.out.println(temp.getCelsius());

    sc.close();

    }
}
