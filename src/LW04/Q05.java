package LW04;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===My Java Lo-Fat burgers===");

        System.out.println("\nEntree :");
        System.out.println("1.Tofu Burger   $3.49 ");
        System.out.println("2.Cajun Chicken  $4.59 ");
        System.out.println("3.Buffalo Wings  $3.99");
        System.out.println("4.Rainbow Fillet  $2.99");

        System.out.println("\nSide Dish :");
        System.out.println("1.Rice Cracker  $0.79");
        System.out.println("2.No-Salt Fries  $0.69");
        System.out.println("3.Zucchini   $1.09 ");
        System.out.println("4.Brown Rice   $0.59");

        System.out.println("\nDrink :");
        System.out.println("1.Cafe Mocha   $1.99");
        System.out.println("2.Cafe Latte   $1.90");
        System.out.println("3.Espresso   $2.49");
        System.out.println("4.Oolong Tea   $0.99");

        System.out.println("Enter Entree(1-4) :");
        int Entree = sc.nextInt();

        System.out.println("Enter Side Dish(1-4) :");
        int Side_Dish = sc.nextInt();

        System.out.println("Enter Drink(1-4) :");
        int Drink = sc.nextInt();

        Double entreeprice =0.0,sideprice =0.0 , drinkprice =0.0;

        if (Entree == 1) {
            entreeprice = 3.49;
        }else if (Entree == 2) {
            entreeprice = 4.59;
        }else if (Entree == 3) {
            entreeprice = 3.99;
        }else if (Entree == 4) {
            entreeprice = 2.99;
        }

        if (Side_Dish == 1) {
            sideprice = 0.79;
        }else if (Side_Dish == 2) {
            sideprice = 0.69;
        }else if (Side_Dish == 3) {
            sideprice = 1.09;
        }else if (Side_Dish == 4) {
            sideprice = 0.59;
        }

        if (Drink == 1) {
            drinkprice =1.99;
        }else if (Drink == 2) {
            drinkprice =1.90;
        }else if (Drink == 3) {
            drinkprice =2.49;
        }else if (Drink == 4) {
            drinkprice =0.99;
        }

        Double totalprice = entreeprice + sideprice + drinkprice;

        System.out.println("\nTotal Price :"+ totalprice);

        sc.close();

    }
}
