package day48;

public class BounceActivity {
    public static void main(String[] args) {
        Ball b1=new Ball("round","red");
        System.out.println("b1 = " + b1);
        b1.bounce();
        System.out.println("Gravity is "+Ball.GRAVITY);

        System.out.println("___________");

        Kangaroo k1=new Kangaroo("Hakki",9);
        System.out.println(k1);
        k1.bounce();
        k1.eat();
        System.out.println("k1.GRAVITY = " + k1.GRAVITY);
        k1.carryChildInThePocket();
        k1.kickBox();

        // SuperType variableName= new SubType(....);  THIS WORKS
        //this will be explained much in detail in its own days
        //List<Integer> lst = new ArrayList<>();

        Bouncible k2 = new Kangaroo("Toto",6);
        Bouncible b2= new Ball("round","blue");



    }
}
