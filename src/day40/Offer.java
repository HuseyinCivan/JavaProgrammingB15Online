package day40;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;

    //this is an instance method to print all the information about offer object
    //
    //inside instance method we can directly access instance variable
    public void displayInformation(){
        System.out.println( "Location = " + location + " | " +
                            "Company = " + company + " | "+
                             "Salary = " + salary + " $ | " +
                             "isFullTime = " + isFullTime );
    }

    //write a method called turnToFullTime

    public void turnToFullTime(){
        //isFullTime=true;
        if(isFullTime==false){
            isFullTime=true;
        }else{
            System.out.println("already fulltime");
        }
    }
//write a method, change the location of the object of the offer to the location user passed

    public void changeLocation(String newLocation){
        location=newLocation;
    }
//write a method to accept 4 parameters to change all info
    //about offers

    public void changeAllInfo(String newCompany,String newLocation,long newSalary, boolean newIsFullTime){
        company=newCompany;
        location=newLocation;
        salary=newSalary;
        isFullTime=newIsFullTime;
        //an instance method can call another instance method
        //an instance method can use any instance fields
        //since we already have functionality to display information
        //we called it here to display new information after modifying
        displayInformation();
    }
    // write a method to check the offer belong 100k and return result as true false

    public boolean is100KOffer(){
//        if(salary>=100000){
//            return true;
//        }return false;

        //salaty>=100000 is allredy generate a boolean result
        //so you can directly return this result
        return salary>=100000;
    }


    //create an instance method called toString
    //has no parameter
    //return String representation of offer object
    //in below format
    //[Location = Virginia | Company = Amazon | Salary = 150000 $ | isFullTime = true]

    public String toString(){
        String allInfo="[ Location = " + location + " | " +
                "Company = " + company + " | "+
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime+" ]";

        return allInfo;
    }






}
