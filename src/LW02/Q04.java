package LW02;
import java.util.*;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers=new int[5];
        int i;
        for (i=0; i<5; i++){
            System.out.print("Enter an integer : ");
            numbers[i]= scanner.nextInt();
            System.out.println();
        }

        int max;
        int second_max;

        if (numbers[0]<=numbers[1]){
            max=numbers[1];
            second_max=numbers[0];
        }else {
            max=numbers[0];
            second_max=numbers[1];
        }

        for (i=2; i<5; i++){
            if(max<numbers[i]){
                second_max=max;
                max=numbers[i];
            }else if(second_max<numbers[i] && numbers[i]<max){
                second_max=numbers[i];
            }else {
                continue;
            }
        }
        System.out.println("Second Maximum Number From Entered Numbers : "+second_max);
    }

}