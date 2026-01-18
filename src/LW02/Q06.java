package LW02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q06 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(formatter.format(today));
    }
}