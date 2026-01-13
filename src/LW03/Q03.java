package LW03;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Owner owner = new Owner("user1", "0771234567");

        Bicycle bicycle = new Bicycle(owner);

        System.out.println("Owner Name : " + bicycle.getOwner().getOwnerName());
        System.out.println("Phone No   : " + bicycle.getOwner().getPhoneNo());


    }
}
