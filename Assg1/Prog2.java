import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if(isPalindrome(num)) System.out.println(num + " is a palindrome.");
        else System.out.println(num + " is not a palindrome.");
    }

    public static boolean isPalindrome(int num) {
        int temp = num;
        int reversed = 0;
        
        // reverse number
        while (temp > 0){

            reversed = (reversed * 10) + (temp%10);
            temp /= 10;         
            
        }
        return reversed == num;
    }



    public static int digitCount(int num) {
        int count = 0;
        while (num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
}


