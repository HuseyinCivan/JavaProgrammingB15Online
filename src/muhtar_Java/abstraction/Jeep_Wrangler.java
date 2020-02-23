package muhtar_Java.abstraction;

public class Jeep_Wrangler implements Cars,GasVehicle {
    public void start(){
        System.out.println("Call Mechanic");
        System.out.println("oil change");

    }
    public void pumpGas(){
        System.out.println("pumping gas");
    }


}
