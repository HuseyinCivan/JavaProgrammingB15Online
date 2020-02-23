package day51;


//Flyable is super type of UprightFlyable
//Flyable is more general, UprightFlyable is slightly less general but still abstract idea
public interface UpFlightFlyable extends Flyable{



    public abstract void flyUpright();
}
