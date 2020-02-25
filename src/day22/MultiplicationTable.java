package day22;

public class MultiplicationTable {
    public static void main(String[] args) {

//        System.out.println("1 x 1 = "+1*1);
//        System.out.println("1 x 2 = "+1*2);
//        System.out.println("1 x 3 = "+1*3);


        System.out.println("multiplication table of 1 ");
        for (int x = 1; x <= 12; x++) {

            System.out.println("1 x " + x + " = " + 1 * x);

        }

        System.out.println("________________________________");


        System.out.println("multiplication table of 2 ");
        for (int x = 1; x <= 12; x++) {

            System.out.println("2 x " + x + " = " + 2 * x);

        }

        for (int timesTable = 1; timesTable <= 10; timesTable++) {
            System.out.println();
            System.out.println("multiplication table of " + timesTable);

            for (int base = 1; base <= 12; base++) {

                System.out.println(timesTable + " x " + base + " = "+timesTable*base);


            }
            System.out.println();

        }
    }}
