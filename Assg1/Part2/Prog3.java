package Part2;

import java.util.Arrays;
import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();

        if(checkAnagram(s1, s2))
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        else
            System.out.println(s1 + " and " + s2 + " are not anagrams.");

    }

    public static boolean checkAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        char [] charS1= s1.toLowerCase().toCharArray();
        char [] charS2= s2.toLowerCase().toCharArray();
        Arrays.sort(charS1);
        Arrays.sort(charS2);
        return Arrays.equals(charS1, charS2);
    }
}
