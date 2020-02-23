package day50;

public class Main {
    public static void main(String[] args) {
        Square s1=new Square("my precious",10);
        System.out.println("s1 = " + s1);  //BEFORE s1.calculate();

        s1.calculateArea();

        System.out.println("s1 = " + s1); //AFTER s1.calculate();
        s1.draw();
        System.out.println("_______________________________");
        Circle c1=new Circle("abc",5);
        System.out.println("c1 = " + c1);

        c1.calculateArea();

        System.out.println("c1 = " + c1);
        c1.draw();

    }
}
