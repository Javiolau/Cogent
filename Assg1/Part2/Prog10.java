package Part2;

import java.util.Scanner;

public class Prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a String to remove first vowel: ");
        String s = sc.nextLine(); 
        String w = "qwe";
        
        System.out.println(replaceFirstVowel(s));
        
    }

    public static String replaceFirstVowel(String s) {
        String r = s;
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){                
                r = r.replaceFirst(String.valueOf(c), "");
                break;
            } 
            
        }
        return r;
    }
}
