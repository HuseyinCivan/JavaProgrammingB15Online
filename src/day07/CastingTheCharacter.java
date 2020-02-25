package day07;

public class CastingTheCharacter {
    public static void main(String[] args) {

        char aChar='B';

        int letterInMumber='C';
        // 'C' is repersented by 67 in ascii table
        // here type char is automatically widened to int
        // and store as number

        System.out.println(letterInMumber);
        int anInt=aChar;
        System.out.println(anInt);

        int letterInNumber2='b';
        System.out.println(letterInNumber2);

        char myFirstChar=100;
        System.out.println(myFirstChar);

        char myFirstName1='H';
        char myFirstName2='U';
        char myFirstName3='S';
        char myFirstName4='E';
        char myFirstName5='Y';
        char myFirstName6='I';
        char myFirstName7='N';

        int myFirstName_Int1=myFirstName1;
        int myFirstName_Int2=myFirstName2;
        int myFirstName_Int3=myFirstName3;
        int myFirstName_Int4=myFirstName4;
        int myFirstName_Int5=myFirstName5;
        int myFirstName_Int6=myFirstName6;
        int myFirstName_Int7=myFirstName7;   // ama boyle yapma . daha kolayi asagida

        System.out.println(myFirstName_Int1+" "+myFirstName_Int2+" "+myFirstName_Int3+" "+myFirstName_Int4+" "+myFirstName_Int5+" "+myFirstName_Int6+" "+myFirstName_Int7);



        // int n=1009000;
        //char dChar= (char) n;
        //System.out.println(dChar);


        int h= 'H';
        int u= 'u';
        int s= 's';
        int e= 'e';
        int y= 'y';
        int i= 'i';
        int n= 'n';

        System.out.println(h+" "+u+" "+s+" "+e+" "+y+" "+i+" "+n); //daha kolayi


        char letterA='a';
        System.out.println(letterA+1);
        System.out.println(" "+letterA+1);














    }
}
