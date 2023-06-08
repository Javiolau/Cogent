public class Prog3 {
    public static void main(String[] args) {
        int x = 23;
        int y = 100;
        int temp = x;

        System.out.println("x: " + x + " y: " + y);
        x=y;
        y= temp;
        System.out.println("x: " + x + " y: " + y);
    }

    
}
