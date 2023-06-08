import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + reverse(num));


    }

    public static int reverse(int num) {
        int temp = num;
        int reversed = 0;
        
        // reverse number
        while (temp > 0){

            reversed = (reversed * 10) + (temp%10);
            temp /= 10;         
            
        }
        return reversed;
    }
}
