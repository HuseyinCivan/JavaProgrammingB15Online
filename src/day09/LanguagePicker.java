package day09;

public class LanguagePicker {
    public static void main(String[] args) {
/*
    // TASK 3 :

Language Picker :
// assume you are on the call and you have been given option to be greeted by the language of your choice according to the number you provided
Create a variable called languageOption , String variable called greeting

        1   —>> "Hello"
        2  —>> "Salam"
        3  —>> "Hola"
        4  —>> "Privet"
        5  —>> "Merhaba"
        6  —>> "Szia"
        7 —>  " bonjour"

The program should set the value of a String variable called greeting
 To this value.  :  1  —> "Hello , SDET "

Print out —>> This is how the greeting message you get : "Hello , SDET "
  */

        int languageOption = 80;
        String greeting = "";

        if (languageOption == 1) {
            greeting = "Hello";
        } else if (languageOption == 2) {
            greeting = "Salam";
        } else if (languageOption == 3) {
            greeting = "Hola";
        } else if (languageOption == 4) {
            greeting = "Privet";
        } else if (languageOption == 5) {
            greeting = "Merhaba";
        } else if (languageOption == 6) {
            greeting = "Szia";
        } else if (languageOption == 7) {
            greeting = "Bonjur";
        } else {
            greeting = "bonjour!!";
        }
        System.out.println(greeting + ",SDET");


    }
}
