package day10;

public class Answer {
    public static void main(String[] args) {

        String myAnswer="";
        int myNumber=45;

        //if the number can be divided by 5 without remiander,
        //assign myAnswer valu to FizzNmuber
        //if not assign the value not a Fizz number

        //outside if else statement:print my number is

        if (myNumber%5==0){
            myAnswer="Fizz NUmber";
        }else{
            myAnswer="not Fizz Number";
        }
        System.out.println("my number is "+myNumber+" , it is "+myAnswer);



    }
}
