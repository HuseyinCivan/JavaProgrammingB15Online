package day51;

//a class  implement interface
//an interface  extends another interface
// a class extends another class

public class Drone implements UpFlightFlyable {


    @Override
    public void flyUpright() {
        System.out.println("flying upright");
    }

    @Override
    public void fly() {
        System.out.println("flying regularly");
    }





}
