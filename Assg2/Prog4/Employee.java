package Prog4;

public class Employee {
    private static int count = 1;
    private int id;
    private String name;
    private String department;
    private int age;
    private String email;

    public Employee(){
        this.id = count;
        count++;
    }

    public void setEmployee(String name, String department, int age, String email){
        this.email=email;
        this.age=age;
        this.department=department;
        this.name=name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Address: " + department);
        
    }


}
