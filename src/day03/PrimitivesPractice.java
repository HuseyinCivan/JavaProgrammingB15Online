package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {


        byte letterCount =26;
        System.out.println("The Letter Count is " + letterCount );

        short sheepCount = 300;
        System.out.println("The Sheep Count is "+ sheepCount);

        int catCount = 20;
        System.out.println("The Cat Count is " + catCount);

        long mileToMoon = 500000l;
        System.out.println("The Mile to Moon is "+mileToMoon);

        long mileToSun  = 1000000L;
        System.out.println("The Mile to Sun is "+ mileToSun);


        //-------------- floatibg point number ------------


        //you must add f at the end of the number to indicate this is float data tipe
        //uppercase lower case does not matter , but it is mandatory,
        float priceOfBanana = 1.99f;
        System.out.println("The Price of Banana is "+priceOfBanana);

        float priceOfPotato = 2.99F;
        System.out.println("The Price of Potato is " +priceOfPotato);


        // -------------------larger floating point numbers ---------------

        double priceOfIpad = 355.99d;
        System.out.println("The Price of Ipad is "+priceOfIpad);

        double priceOfIpadPro = 1024.99D;
        System.out.println("The Price of Ipad Pro is "+ priceOfIpadPro);
        //compiler automatically assume it is a double so it is not required to have d
        //however for good programming habit , add them always
        double priceOfMac =2299.99 ;
        System.out.println("The Price of Mac is "+ priceOfMac);

        // if you have a whole number by itself , compiler automatically assume it is an int
        // if you have a fractional number by itself , compiler automatically assume it is a double












    }
}
