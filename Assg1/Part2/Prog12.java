package Part2;

import java.util.Scanner;

public class Prog12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a String");
        String s = sc.nextLine(); 

        System.out.println(removeBlanks(s));

    }

    public static String removeBlanks(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c != ' ') r += String.valueOf(c);
        }      
        return r;  
    }
}
