package Part2;

import java.util.Scanner;

public class Prog9 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a String: ");
        String str = sc.nextLine(); 

        int max= 0;
        char maxChar=Character.MIN_VALUE;
        
        int[] arr = new int[256];
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)]++; 
        }
        for (int i = 0; i < 256; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                maxChar = (char)i;
            }
        }

        System.out.println (maxChar+" is the most repeated character");
    }
}
