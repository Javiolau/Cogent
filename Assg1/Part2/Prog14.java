package Part2;

import java.util.Scanner;

public class Prog14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a String");
        String s = sc.nextLine();

        sumInt(s);

    }

    public static void sumInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){
                sum += Character.getNumericValue(c);
            }
        }
        System.out.println("Sum is : " + sum);
    }
}
