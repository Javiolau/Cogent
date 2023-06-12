package Prog3;

public class Tester {
    public static void main(String[] args) {
        Student one = new Student(1, "Javier Oliva", "asda@gmail.com", "Miami, Florida");
        Student two = new Student(2, "Mary Ann", "smasd@gmail.com", "Orlando, Florida");
        Student three = new Student(3, "Maria Lopez", "tert@gmail.com", "Homestead, Florida");
    
        one.printDetails();
        two.printDetails();
        three.printDetails();
    }   
}
