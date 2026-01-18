package LW02;

import java.util.*;

public class Q05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sentence=input.nextLine();
        String fullWord="";
        StringTokenizer st=new StringTokenizer(sentence, ",;.?-*'/ !");
        while(st.hasMoreTokens()){
            String newSentence=st.nextToken().toLowerCase();
            fullWord+=newSentence;
        }
        System.out.println(fullWord);
        String original=fullWord;

        String reverse="";
        while (!fullWord.isEmpty()){
            char lastchar=fullWord.charAt(fullWord.length()-1);
            reverse+=lastchar;
            fullWord=fullWord.substring(0,fullWord.length()-1);
        }
        System.out.println(reverse);
        if (original.equals(reverse)){
            System.out.println("Entered sentence is a palindrome.");
        }else{
            System.out.println("Entered sentence is not palindrome.");
        }

    }
}