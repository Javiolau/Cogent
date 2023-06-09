package Part2;

import java.util.Scanner;

public class Prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();

        countVowelsConsonants(s);
    }

    public static void countVowelsConsonants(String s) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if(c <= 'z' && c >= 'a'){
                if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                    consonantCount++;
                }  
                else vowelCount++;
            }
        }
        System.out.println(s + " has " + vowelCount + " vowels and " + consonantCount + " consonants.");
    }
}
