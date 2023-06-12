


import java.util.Scanner;

public class Prog1{
    public static void main(String[] args) {
        final int NAME_COUNT = 5; 
        Scanner sc = new Scanner(System.in);
        String [] nameList = new String[NAME_COUNT];
        System.out.println("Enter Five Names: ");

        for (int i = 0; i < nameList.length; i++) {
            System.out.println("Name " + (i+1) +": " );
            nameList[i]=sc.nextLine();
        }

        System.out.println();

        for (String string : sortNames(nameList)) {
            System.out.print(string + ' ');
        }

    }

    public static String[] sortNames(String [] nameList) {
        for (int i = 0; i < nameList.length; i++) {
            for (int j = i+1; j < nameList.length; j++) {
                if(nameList[i].compareToIgnoreCase( nameList[j]) > 0 ){
                    String temp = nameList[i];
                    nameList[i] = nameList[j];
                    nameList[j] = temp;
                }
            }
        }
        return nameList;
    }
}