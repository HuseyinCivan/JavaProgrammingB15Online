package muhtar_Java.abstraction;

public class DealerShip {
    public static void main(String[] args) {

        Tesla_Model3 obj1=new Tesla_Model3();
        obj1.Charge();
        obj1.start();
        obj1.SelfDrive();
        obj1.fly();

        System.out.println("______________________");

        Jeep_Wrangler obj2=new Jeep_Wrangler();
        obj2.pumpGas();
        obj2.start();

        System.out.println("______________________");

        Toyota_Hybrid obj3= new Toyota_Hybrid();
        obj3.Charge();
        obj3.fly();
        obj3.pumpGas();
        obj3.SelfDrive();
        obj3.start();





    }
}
