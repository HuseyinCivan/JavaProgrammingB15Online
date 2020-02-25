package day17;

public class WakeUp_FullNameCorrector {
    public static void main(String[] args) {

       String fullName= "arYa sTarK";

       String firstName=fullName.substring(0,fullName.indexOf(" "));
       String lastName=fullName.substring(firstName.indexOf(" ")+1);

       String firstNameCorrected=firstName.toUpperCase().substring(0,1)+firstName.toLowerCase().substring(1);
        System.out.println("firstNameCorrected = " + firstNameCorrected);

String lastNameCorrected=lastName.toUpperCase().substring(0,1)+lastName.toLowerCase().substring(1);
        System.out.println("lastNameCorrected = " + lastNameCorrected);

        System.out.println(firstNameCorrected+" "+lastNameCorrected);










    }



}
