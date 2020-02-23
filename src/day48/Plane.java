package day48;


//we build relationship between class and interface
//using implements keyword ( compare to extends keyword for class to class)
//t will buiuld a IS-A relationship
//we can say Plane IS-A Flyable  | inheritance
//since we are inheriting an abstract method
//we need to provide body by overriding it
public class Plane implements Flyable {

    String name;
    int capacity;
    int speed;
    //public static final boolean HAVE_WING=true;

    @Override
    public void fly() {
        System.out.println("plane is flying ");

    }

    //bad idea just for depo purpose
    public static void main(String[] args) {
        Plane p1=new Plane();
        p1.fly();
        //anything static, we can access in static way
        //include the static field of interface
        System.out.println(Flyable.HAVE_WING);
        //if we have static filed in this class
        //can we access them in static method main directly
        System.out.println(HAVE_WING);//or
        System.out.println(Plane.HAVE_WING);//or



    }



}
