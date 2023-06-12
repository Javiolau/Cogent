package Prog5;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        Circle t = new Circle(4);

        System.out.println(c.getArea());
        System.out.println(c.getRadius());
        System.out.println();
        System.out.println(t.getArea());
        System.out.println(t.getRadius());
    }
}
