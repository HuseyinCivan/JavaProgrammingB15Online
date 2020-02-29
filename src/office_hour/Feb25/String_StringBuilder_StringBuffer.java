package office_hour.Feb25;

public class String_StringBuilder_StringBuffer {
    public static void main(String[] args) {

               // StringBuilder ---> mutable
               // StringBuffer --> Syncronized

        StringBuilder sb1= new StringBuilder("word");   // created object in heap memory
        StringBuilder sb2= sb1;

        System.out.println("sb1==sb2 = " + (sb1==sb2));




        //  sb1=new StringBuilder("java");

        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);

        System.out.println("sb1.equals(sb2) = " + sb1.equals(sb2));
        System.out.println("sb1.compareTo(sb2) = " + sb1.compareTo(sb2));

        System.out.println("sb1.reverse() = " + sb1.reverse());
        sb1.append(1);
        System.out.println("sb1 = " + sb1);
        sb1.append(true);
        System.out.println("sb1 = " + sb1);
        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("______________________________");



        StringBuffer sb3= new StringBuffer("word");   // created object in heap memory

        StringBuffer sb4= sb3;

        System.out.println("(sb4==sb3) = " + (sb4==sb3));

       // sb3=new StringBuffer("java");
        sb3.reverse();

        System.out.println("AFTER REVERSE sb3 = " + sb3);
        System.out.println("AFTER REVERSE OF SB3 - sb4 IS = " + sb4);

        System.out.println("______________________________");


        String word= "Apple";
        StringBuilder word2= new StringBuilder(word);
        System.out.println("word2.reverse() = " + word2.reverse());

        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("______________________________");


        StringBuilder sb5=new StringBuilder("Huseyin");
        String sb6=String.valueOf(sb5);
        StringBuilder sb7=sb5;
        StringBuffer sb8=new StringBuffer(sb6);
        StringBuffer sb9=new StringBuffer(sb5);
        StringBuilder sb10=new StringBuilder(sb5);


        System.out.println("StringBuilder sb5 = " + sb5);
        System.out.println("String sb6 = " + sb6);
        System.out.println("StringBuilder sb7 = " + sb7);
        System.out.println("StingBuffersb8 = " + sb8);
        System.out.println("\n______________________________\n");

      //sb5=new StringBuilder("Seda");
       //sb5.reverse();
       // sb5.append(" Seda");
        System.out.println("StringBuilder sb5 = " + sb5);
        System.out.println("String sb6 = " + sb6);
        System.out.println("StringBuilder sb7 = " + sb7);
        System.out.println("StingBuffer sb8 = " + sb8);
        System.out.println("StingBuffer sb9 = " + sb9);
        System.out.println("sb10 = " + sb10);


        System.out.println("\n______________________________\n");
        System.out.println("\n______________________________\n");

        String str1= "Seda";
        String str2=str1;

        str1=str1.replace("e","a");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);






    }
}
