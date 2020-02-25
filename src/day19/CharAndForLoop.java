package day19;

public class CharAndForLoop {
    public static void main(String[] args) {

        // each character has its corresponding ascii value
        //from the ascii table

        //int x = 'A';
        char myChar='A';  //e

       // System.out.println(x);
        System.out.println(myChar);

        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);

        System.out.println('A'>'B');
        System.out.println('Z'>'B');



        for(  char iChar='A'; iChar<='Z';iChar++){
            System.out.print(iChar+ " ");
        }
        System.out.println();

        for( char kChar='Z';kChar>='A';kChar--){
            System.out.print(kChar+" ");
        }

        // HOMEWORK
        //CREATE AN INTERACTIVE PROGRAM TO ASK USER STARTING CHARACTER AND ENDING CHARACTER
        //THEN PRINT EVERYTHING IN BETWEEN
        //IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        //FOR EXAMPLE USER CAN ENTER Z A . or  A K
        //Can we ask user character ? NO !!!
        // Ask user for String and pick first character by CharAt(0)













    }
}
