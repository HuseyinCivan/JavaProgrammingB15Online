package practice12_30_19;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {

        Integer i1=12;
        int i2= Integer.valueOf("12");
        System.out.println("i2 = " + i2);

        String employeeID="FB-457";

        String[] arrID=employeeID.split("-");
        System.out.println(Arrays.toString(arrID));
        int numberID=Integer.parseInt(arrID[1]);
        System.out.println("numberID = " + numberID);

        String twoNUmbers="100,600";

Integer x=12;
        int i3= x;
        System.out.println("x = " + x);
        System.out.println("i3 = " + i3);
        System.out.println("______________________________");

        String sentence="IPR2012-00001";

        String yearStr=sentence.substring(3,7);
        int year=Integer.parseInt(yearStr);
        System.out.println("year = " + year);


    }
}
