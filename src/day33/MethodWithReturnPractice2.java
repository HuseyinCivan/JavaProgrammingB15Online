package day33;

public class MethodWithReturnPractice2 {
    public static void main(String[] args) {

        System.out.println(getDaysOfTheWeekFromNumber(1));
        System.out.println(getDaysOfTheWeekFromNumber(2));
        System.out.println(getDaysOfTheWeekFromNumber(3));
        System.out.println(getDaysOfTheWeekFromNumber(4));
        System.out.println(getDaysOfTheWeekFromNumber(5));
        System.out.println(getDaysOfTheWeekFromNumber(6));
        System.out.println(getDaysOfTheWeekFromNumber(7));

        System.out.println("__________________________");
        System.out.println(getDaysOfTheWeekFromNumber(8));
        System.out.println("===================================");

        int[] allCodes={5,3,11,4,33};

        for (int eachCode : allCodes) {
            System.out.println("each day "+ getDaysOfTheWeekFromNumber(eachCode));

        }
        System.out.println("__________________________");
        System.out.println("__________________________");
        for (int x = 0; x < allCodes.length; x++) {

            String day=getDaysOfTheWeekFromNumber(x);
            System.out.println("day = " + day);

        }


    }
    /**
     * getDaysOfTheWeekFromNumber
     * This method will take number from 1-7
     * and convert that to actual day in word
     //* @param  intt dayCode as int to present day in number
     * @return the day in word in English as String if the number is valid
     *         if the number is valid
     *         if the number is not 1-7 return FUNDAY!
     */
public static String getDaysOfTheWeekFromNumber(int daycode){

    String [] daysArray={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    String day="";
 if(daycode>0 && daycode<=7 ){
     day=daysArray[daycode-1];
 }else{
     day="FUNDAY";
 }

    return day;
}

}
