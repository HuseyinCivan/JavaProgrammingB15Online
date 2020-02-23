package day55;
// Taxi Engine -- Driver --Passenger

//taxi has driver -- Driver object has 2 attribute ( name , driverId )

// Create a class called Driver , has 2 attribute ( name String , driverId int )
        // constructor to set the value ,add toString method so we can print out
//Add instance field called Driver dr, update your constructor to set Driver as well,




public class Taxi {

    int plateNumber;
    Engine eng;
    Driver dr;



    public Taxi(int plateNumber, Engine eng, Driver dr) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.dr=dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", eng=" + eng.toString() +
                ", dr=" + dr.toString() +
                '}';
    }
}
class Driver{

    String name;
    int driverID;

    public Driver(String name, int driverID) {
        this.name = name;
        this.driverID = driverID;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverID=" + driverID +
                '}';
    }
}



class Engine{
    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}


