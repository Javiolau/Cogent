package Part2;

import java.util.Scanner;

public class Prog16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a String: ");
        String s = sc.nextLine();

        sortAsc(s);
    }

    public static void sortAsc(String s) {
        char [] charList = s.toCharArray();
        for (int i = 0; i < charList.length; i++) {
            for (int j = i+1; j < charList.length; j++) {
                if(Character.toLowerCase(charList[i]) > Character.toLowerCase(charList[j])){
                  char temp = charList[i];
                  charList[i] = charList[j];
                  charList[j] = temp;
                }
            }
        }
        System.out.println("Ascending order string: " + String.valueOf(charList));
            
    }
}
