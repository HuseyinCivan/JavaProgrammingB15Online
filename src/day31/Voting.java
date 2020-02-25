package day31;

public class Voting {
    public static void main(String[] args) {

        checkEligibility(15);
        checkEligibility(23);
        checkEligibility(63);

        //can not access the method parameter outside of the method

        int yourAge=12;
        checkEligibility(yourAge);



    }
// this method has one parameter int named age
    //whoever calling this method, need to provide a number
    //it will set the value of age into that  number
public static void checkEligibility( int age   ){

   //int age=15;
    if(age>18){
        System.out.println("you are eligible to vote");
    }else{
        System.out.println("you are not eligible");
    }

}


}
