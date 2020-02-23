package muhtar_Java.abstraction;

public class Toyota_Hybrid implements Cars,GasVehicle,ElectricVehicles{
    @Override
    public void start() {
        System.out.println("push start button");
    }

    @Override
    public void Charge() {
        System.out.println("charging");
    }

    @Override
    public void SelfDrive() {
        System.out.println("self driving");
    }

    @Override
    public void fly() {
        System.out.println("toyota is flying");
    }

    @Override
    public void pumpGas() {

    }
}
