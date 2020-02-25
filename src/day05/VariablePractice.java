package day05;

public class VariablePractice {
    public static void main(String[] args) {

        // 8 primitive
       /*
        line1
        line 2
        line 3
        block comment, everiting in between will be seen as comment

        whole numbers       : byte , short , int , long
        fractional number   : float , double
        logical             :boolean ( true , false )
        character           : char ( single character in single quote )


        usually by default for whole numbers : just use int
        usually by default for fractional numbers : just use double

        Is String part of Primitive types ? NO!!!!
        String is sequence of character

         */

        // age calculator
        // given birth year , please calculate the age

        int birthYear=2001;
        int currentYear=2019;
        int age=currentYear-birthYear;
        // i was born in year 2001 , and i am 18 years old ;

        System.out.println("I was born in "+birthYear+"  , and i am "+(currentYear-birthYear)+" years old.");
        System.out.println("I was born in "+birthYear+"  , and i am "+age+" years old.");

        // Task 2 : you are speeding today
        // speed limit is some number , and your current speed is this
        // generate this output of : You are driving 10 mph more than speed limit
        // speedlimit as int, currentSpeed as int ,overTheLimit as int

        int speedLimit=80;
        int currentSpeed=90;
        int overTheLimit=(currentSpeed-speedLimit);

        System.out.println("You are driving "+overTheLimit+ " mph more than speed limit.");













    }
}
