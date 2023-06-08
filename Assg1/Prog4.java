import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        printPrimeFactors(num);
        
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

    public static void printPrimeFactors(int num) {
        System.out.print("Prime factors: ");
        for (int i = 2; i < num; i++) {
            if(num%i==0 && isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
