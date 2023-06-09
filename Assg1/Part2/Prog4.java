package Part2;

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        String sr = sb.reverse().toString();

        if(s.equals(sr))
            System.out.println( s + " is Palindrome.");
        else
            System.out.println( s + " is not Palindrome."); 
    }
}
