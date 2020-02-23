package day47;

public class ShapeTest {
    public static void main(String[] args) {
        Triangle t1=new Triangle("triangle",10,6);
        System.out.println("BEFORE t1 = " + t1);
        t1.calculateArea();
        System.out.println("AFTER t1 = " + t1);
    }
}
