package day09;

public class LanguagePicker_Switch_Version {
    public static void main(String[] args) {

//        // TASK 3 :
//
//        Language Picker :
//// assume you are on the call and you have been given option to be greeted by the language of your choice according to the number you provided
//        Create a variable called languageOption , String variable called greeting
//
//        1   —>> "Hello"
//        2  —>> "Salam"
//        3  —>> "Hola"
//        4  —>> "Privet"
//        5  —>> "Merhaba"
//        6  —>> "Szia"
//        7 —>  " bonjour"
//
//        The program should set the value of a String variable called greeting
//        To this value.  :  1  —> "Hello , SDET "
//
//        Print out —>> This is how the greeting message you get : "Hello , SDET "
//                */

   int language=7;
   String greeting="";
   switch(language){

       case 1:
           greeting="Hello";
           break;
       case 2:
           greeting="Salam";
           break;
       case 3:
           greeting="Hola";
           break;
       case 4:
           greeting="Privet";
           break;
       case 5:
           greeting="Merhaba";
           break;
       case 6:
           greeting="Szia";
           break;
       case 7:
           greeting="Bonjour";
           break;
       default:
           greeting="UNKNOWN!!";

   }
        System.out.println(greeting + ",SDET");










    }
}
