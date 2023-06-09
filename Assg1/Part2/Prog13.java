package Part2;

import java.util.Scanner;

import javax.xml.transform.Source;

public class Prog13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a String");
        String s = sc.nextLine(); 

        removeRepeated(s);
       // System.out.println(removeBlanks(s));

    }

    public static void removeRepeated(String s) {
        String r = "";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length()-1; i++) {
            boolean repeated = false;
            int j = i+1;
            while(j < s.length()){
                if(s.charAt(i) == s.charAt(j)){
                    
                    sb.setCharAt(j, ' ');
                    repeated = true;
                }
                
                j++;
            }
            if(repeated)sb.setCharAt(i, ' ');
        }   
        char [] charList = sb.toString().toCharArray();
        
        for (int i = 0; i < charList.length; i++) {
            if(charList[i] != ' '){
                r+=charList[i];
            }
        }
        System.out.println(r);     
    }
}
