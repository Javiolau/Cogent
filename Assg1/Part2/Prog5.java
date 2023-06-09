package Part2;

import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        char c = sc.next().charAt(0);
        c=Character.toLowerCase(c);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            System.out.println(c + " is a vowel.");
        else 
            System.out.println(c + " is a consonant");
    }
}
