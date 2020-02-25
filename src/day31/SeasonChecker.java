package day31;

public class SeasonChecker {
    public static void main(String[] args) {
        // a String variable declared and assigned value inside main method
        //it can be accessible in main method
     String mySeason="AAAA";

     decideSeasonAction("Winter");
     decideSeasonAction("Summer");
     decideSeasonAction(mySeason);



    }

    /*
    * write a ststic method called decideSeasonAction
    * it has one string parameter called season
    * inside method body:
    * according to what user passed print correct action
    * */

    public static void     decideSeasonAction (String season){
        // this season method paramether can only be accessible inside method body
        switch (season){
            case "Spring":
                System.out.println("hiking");
                break;
            case "Summer":
                System.out.println("swimming");
                break;
            case "Fall":
                System.out.println("pumpkin picking");
                break;
            case "Winter":
                System.out.println("go snowboarding");
                break;
            default:
                System.out.println("invalid season");

        }

    }


}
