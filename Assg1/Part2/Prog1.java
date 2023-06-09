package Part2;

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Enter character to remove: ");
        char c = sc.next().charAt(0);

        
        System.out.println(s.replaceAll(String.valueOf(c), ""));

    }

    
}
