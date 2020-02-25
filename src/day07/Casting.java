package day07;

public class Casting {
    public static void main(String[] args) {

        //int num=10;

        //10 is  implicitly (automatically) converted to double 10.0
        //and stored inside bigNum behind scene
        //double bigNum=10;
        //System.out.println(bigNum);


        // 12.99 is double , double has much bigger range than int
        //so it just does not fit
        //int num=12.99; // compiler error

       // int num= (int) 12.99;
        //System.out.println(num);

        //cerate a long variable and store int
        //create an int variable and tyr to store above long value

        long numL=73244546;
        int numI= (int) numL;

        System.out.println(numI);

        //int NumInt2=345435;
        //long numLong2=NumInt2;
        //System.out.println(numLong2);

        long earthToMoon=10000;
        int earthToMoonIN_int=(int)earthToMoon;

        System.out.println(earthToMoonIN_int);








    }
}
