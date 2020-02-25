package day39;

public class Garage {
    public static void main(String[] args) {

        // create car object using Class
        //or
        //get an instance of Car class

        Car car1=new Car();

        car1.color="Red";
        car1.make="Tesla";
        car1.model="x";
        car1.year=2020;

        car1.goForward();
        car1.printCarAge();
        car1.changeColorTo("Blue");

        System.out.println("car1.year = " + car1.year);
        System.out.println("car1.model = " + car1.model);
        System.out.println("car1.make = " + car1.make);
        System.out.println("car1.color = " + car1.color);

        System.out.println("==========================");

        Car car2=new Car();

        car2.color="White";
        car2.make="Lexus";
        car2.model="ES350";
        car2.year=2016;

        car2.printCarAge();
        car2.goForward();
        System.out.println("car2.year = " + car2.year);
        System.out.println("car2.model = " + car2.model);
        System.out.println("car2.make = " + car2.make);
        System.out.println("car2.color = " + car2.color);
        System.out.println("____________");

        car2.year=2020;
        System.out.println("car2.year = " + car2.year);

        // i want to change the color of tesla to teh color of lexus
        car1.color=car2.color;
        System.out.println("car1.color = " + car1.color);




    }
}
