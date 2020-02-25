package day15;

public class ReplaceMethod {
    public static void main(String[] args) {

        // repplace method of string

        String message="I love Pumpkin , Pumpkin IS FUN!";
        message.replace("Pumpkin","Java!");

        message=message.replace("Pumpkin","Java!");
        System.out.println(message);

        // what if i want to replace space from everywhere.

        String message2="Happy Thanks Giving to All!!";
//      Happy Thanks Giving to All!! ----> Happy Thanksgiving to All!!

        message2=message2.replace("Thanks Giving","Thanksgiving");
        System.out.println("message2 = " + message2);

        //remove all the space

        message2=message2.replace(" ","");
        System.out.println("message2 = " + message2);

        String message3="TOMORROW IS OFF NO!";
        //how do we remove NO!

        message3=message3.replace(" NO!","");
        System.out.println("message3 = " + message3);










    }
}
