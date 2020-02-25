package day22;

public class ArrayPractice1 {
    public static void main(String[] args) {

  double[] prices=new double[5];
        System.out.println(prices[0]);

// can not print our array variable to see directly inside
        System.out.println(prices);

        prices[0]= 2.46;
        prices[1]=12.96;
        prices[2]=992.01;
        prices[3]=500;
        prices[4]=65.123;

        // what if i go over the range
        //RUN TIME OVER!!!
        //prices[5]=165.3;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);


        //create a char array that hold all the letter from your first name
        // and assign the values using each characters of your first name
        // than print out each character

        char firstName[]=new char[7];


        firstName[0]='H';
        firstName[1]='u';
        firstName[2]='s';
        firstName[3]='e';
        firstName[4]='y';
        firstName[5]='i';
        firstName[6]='n';
        System.out.println("_______________________________");
        //this will actually print the content of char array not memory address,
        //THIS IS ONLY FOR CHAR ARRAY , ANYTHING ELSE WILL PRINT MEMORY ADDRESS
        System.out.println(firstName);
        System.out.println("_______________________________");
        System.out.println(firstName[0]);
        System.out.println(firstName[1]);
        System.out.println(firstName[2]);
        System.out.println(firstName[3]);
        System.out.println(firstName[4]);
        System.out.println(firstName[5]);
        System.out.println(firstName[6]);


char name[]={'H','u','s','e','y','i','n'};

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);
        System.out.println(name[5]);
        System.out.println(name[6]);

        //WHAT DEFAULT VALUE DO WE GET FOR CHAR ARRAY
        // WE GET A CHAR REPRESENTED BY ASCII CODE 0

        char blank[]=new char[3];
        System.out.println(blank[0]);   // nothing

        System.out.println(blank);   // nothing


        boolean[] yesNo=new boolean[3];

        yesNo[0]=true;
        yesNo[1]= false;
        yesNo[2]=10>7;  // true or false u veren her durum yazilabilir


        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);






    }
}
