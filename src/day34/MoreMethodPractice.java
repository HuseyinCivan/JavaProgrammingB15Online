package day34;
//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
// We are in trouble if they are both smiling or
// if neither of them is smiling. Return true if we are in trouble.
//For example :
//monkeyTrouble(true, true) → true
//monkeyTrouble(false, false) → true
//monkeyTrouble(true, false) → false
//public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
//    //TODO : Your code goes here
//}
public class MoreMethodPractice {
    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));


    }

    /**
     * @param aSmile
     * @param bSmile
     * @return
     */
    public static String monkeyTrouble(boolean aSmile, boolean bSmile) {   // instead of boolean --->  String
//return aSmile==bSmile ;
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return "yes";
        } else {
            return "no";
        }

        //return ((aSmile&&bSmile) || (!aSmile && !bSmile))  ;
        //}


    }
}
