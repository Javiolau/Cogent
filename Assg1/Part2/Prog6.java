package Part2;

import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        char c = sc.next().charAt(0);
        c=Character.toLowerCase(c);
    
            if(c >= '0' && c <= '9')
                System.out.println(c + " is a digit.");
            else 
                System.out.println(c + " is not a digit");
    }
    
    
}
