package day10;

public class MultiBranch_WithSwitch {
    public static void main(String[] args) {
        /*
         * 11, Burger
         * 5, French Fry
         * 8, Nuggets
         * 35, Ice Cream
         * */
        String order = "" ;
        int itemNumber = 11 ;

        //what data type of variable i can use here
        // byte short int char String

        switch(itemNumber){
            case 11:
                System.out.println("You have selected 11");
                order = "Burger";
                break; // if break does not show up here
                        // it will just move on to next case
            case 5:
                System.out.println("You have selected 5");
                order = "French Fry";
                break;
            case 8:
                System.out.println("You have selected 8");
                order = "Nuggets";
                break;
            case 35:
                System.out.println("You have selected 35");
                order = "Ice Cream";
                break;
            default:
                System.out.println("YOU HAVE SELECTED UNKNOWn ITEM NUMBER@!!");
                order = "Unknown";
                break;



        }






    }
}
