package day55;

public class TaxiAction {
    public static void main(String[] args) {

        Engine en=new Engine("V6",400);
        Driver d = new Driver ("huseyin",123456);

        System.out.println(d.name.charAt(0));




        Taxi t1=new Taxi(101,en,d);
        System.out.println("t1.eng.horsePower = " + t1.eng.horsePower);
        System.out.println("t1.plateNumber = " + t1.plateNumber);


        System.out.println("t1 = " + t1);

        Taxi t2 = new Taxi(102,
                new Engine("V8", 600),
                new Driver("John", 12345));
        System.out.println("t2 = " + t2);

        System.out.println(t2.dr.name);

        //how do i store the plate number in a variable x;
        int x= t2.plateNumber;

        //how do i store the t2 Driver filed in a variable y ;

        Driver y= t2.dr;

        //how do i store the t2 Engine filed in a variable z ;

        Engine z= t2.eng;

        // how do i get the name of the driver usong t2

        System.out.println("Driver name "+y.name);
        System.out.println("Driver name " + t2.dr.name);






    }
}
