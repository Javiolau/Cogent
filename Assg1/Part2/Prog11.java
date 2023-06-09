package Part2;

import java.util.Scanner;

public class Prog11 {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a String");
        String s = sc.nextLine(); 

        int vowelCount = 0, consonantCount = 0, digitCount = 0, 
        specialCharCount =0;

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            
            if(c <= 'z' && c >= 'a'){
                if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                    consonantCount++;
                else vowelCount++;
            }else if( c >= '0' && c <= '9') {
                digitCount++;
            }else
             specialCharCount++;
        }   
        System.out.println("Vowel: " + vowelCount + "\nConsonant: " + consonantCount + 
        "\nDigits: " + digitCount + "\nSpecial Characters: " + specialCharCount);
    }
}
