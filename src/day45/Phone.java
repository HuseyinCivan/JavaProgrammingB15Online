package day45;

public class Phone extends Electronic{
    //Subclass inherit every instance field, static field
    //subclasses inherit every visible instance methods and static method
    //    String brand;
    //    static boolean useElectricity=true;   ----> 2 field is inherited
    double size;
    double price;


    //bad idea to have main here
    //but we are doing it anyway for less screen to look at
    public static void main(String[] args) {

    Phone p1=new Phone();
    p1.size=12;
    p1.price=399;
    p1.brand="Apple";

        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity);

        System.out.println(useElectricity);


        p1.showBrand();
        displayElectricity();
        Phone.displayElectricity();
        Electronic.displayElectricity();

        //    public void showBrand(){
        //        System.out.println("brand = " + brand);
        //    }
        //    public static void displayElectricity(){
        //        System.out.println("displaying useElectricity = " + useElectricity);
        //    }


    }


}
