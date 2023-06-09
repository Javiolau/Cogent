package Part2;

import java.util.Scanner;

public class Prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();

        System.out.println(removeVowels(s));
    }

    public static String removeVowels(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                r += String.valueOf(s.charAt(i));
            }            
        }
        return r;
    }
}
