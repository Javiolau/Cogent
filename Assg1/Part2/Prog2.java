package Part2;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Enter character to count: ");
        char c = sc.next().charAt(0);

        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(c)) count++;
        }
        System.out.println(c + " appears " + count + " times in " + s);
    }
}
