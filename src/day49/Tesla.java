package day49;
//Task :
//	Create an Interface called Autonomous
//		it has a single abstract method
//			selfDrive()
//	Create an abstract class called Vehicle
//		it has 1 fields
//			year
//		add a constructor to set the field
//		abstract method start() ;
//		non-abstract instance method
//			goForward
//	Create a concrete class called Tesla
//		 add instance field horsePower as int and model as String
//	Tesla extends Vehicle and implements Autonomous
//		add constructor to set all fields
//		implement all abstract methods
//		add toString methods
//	create main method to test your code

public class Tesla extends Vehicle implements Autonomous,Chargeable{
    int horsePower;
    String model;

    public Tesla(int year,int horsePower,String model) {
        super(year);
        this.horsePower=horsePower;
        this.model=model;
    }



    @Override
    public void selfDrive() {
        System.out.println(year+" Tesla "+model+" can self drive");
    }

    @Override
    public void start() {

        System.out.println(year+" Tesla "+model+" is starting by voice control");
    }
    @Override
    public void goForward(){
        System.out.println(year+" Tesla "+model+" is going forward rapidly");

    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }



    public static void main(String[] args) {
        Tesla t1=new Tesla(2020,450,"ModelX");
        System.out.println("t1.model = " + t1.model);
        System.out.println("t1.horsePower = " + t1.horsePower);
        System.out.println("t1.year = " + t1.year);
        t1.selfDrive();
        t1.start();
        t1.goForward();
        t1.charge();
        System.out.println("_____________");
        System.out.println("t1 = " + t1);




    }

//    @Override
//    public void charge() {
//        System.out.println(year+" Tesla "+model+" is full charge in 6 hours");
//    }
}
