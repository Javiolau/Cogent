package Prog3;

public class Student {
    int roll;
    String name, email, address;

    public Student(int roll, String name, String email, String address){
        this.roll = roll;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }
    
}
