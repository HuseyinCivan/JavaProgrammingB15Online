package day20;

public class ReversingAString {
    public static void main(String[] args) {

        // given a String variable name with value
        //reverse this name and store reversed name value into
        //anyother String variable reversedName
        //
        //           01234567
        String name="Jon Snow";
        String reverseName="";

//        System.out.print( name.charAt(7)         );
//        System.out.print( name.charAt(6)         );
//        System.out.print( name.charAt(5)         );
//        System.out.print( name.charAt(4)         );
//        System.out.print( name.charAt(3)         );
//        System.out.print( name.charAt(2)         );
//        System.out.print( name.charAt(1)         );
//        System.out.print( name.charAt(0)         );
//        System.out.println();

int lastIndex=name.length()-1;


        for(int x=lastIndex ; x>=0; x--){

            System.out.println(    x + " index : "   );

            char currentChar=name.charAt(x);
            System.out.println(currentChar);

            reverseName=reverseName+currentChar;



        }
        System.out.println("reverseName = " + reverseName);







    }
}
