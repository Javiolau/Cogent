import java.util.Scanner;

public class Prog1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if(isPrime(num))System.out.println(num + " is prime.");
        else System.out.println(num + " is not prime.");
        
    }
     public static boolean isPrime(int num){
        if(num==1 && num ==0) return false;

        boolean prime = true;
        if(num==2) return prime;        

        for (int i = 2; i < num; i++) {
            if(num%i == 0) {
                prime = false;
                break;
            }
            
        }
        return prime;
     }
}