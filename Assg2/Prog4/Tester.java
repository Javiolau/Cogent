package Prog4;

public class Tester {
    public static void main(String[] args) {
        Employee one = new Employee();
        one.setEmployee("Javier Oliva", "Math", 24, "qwee@gmail.com");
        Employee two = new Employee();
        two.setEmployee("Maria Hndz", "Science", 20, "wfsd2@gmail.com");
        Employee three = new Employee();
        three.setEmployee("Diana", "English", 27, "gfsa@gmail.com");

        one.printDetails();
        two.printDetails();
        three.printDetails();
    }
}
