package day59;

public class General {
    public static void main(String[] args) {
        System.out.println("    THE START");
       // String str = "abc"; //NULL
        String str = "";


        //if you have multy try catch block
        //the most specific type (child type) should come first
        //the more generic type ( super type) should come last

        try {
            System.out.println(str.charAt(0));
            System.out.println("END OF TRY");
        }catch (NullPointerException e){
            System.out.println("NO OBJECT HERE");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("THIS IS THE REST OF EXCEPTION");
        }
        System.out.println("    THE END");

        //String a = "fdf";
        // System.out.println(a.charAt(0);    --->>   shortcut
        // ctrl + alt + t ;

    }
}
