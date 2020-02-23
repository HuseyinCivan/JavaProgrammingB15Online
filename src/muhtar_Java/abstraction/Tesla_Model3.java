package muhtar_Java.abstraction;

public class Tesla_Model3 implements Cars ,ElectricVehicles{


    @Override
    public void start() {
        System.out.println("voice control \"Tesla Start\"");
    }

    @Override
    public void Charge() {
        System.out.println("Charging");
    }

    @Override
    public void SelfDrive() {
        System.out.println("self drive mode");
    }

    @Override
    public void fly() {
        System.out.println("tesla is flying");
    }
}
