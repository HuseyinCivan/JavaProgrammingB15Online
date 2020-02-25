package office_hour;

public class Practice_12_23 {
    public static void main(String[] args) {

        // method it's just a reusable peace of code
        //with return type and withoud (void)
        //method can be with parameter/s or without

        String word="computer";

        System.out.println(reverseString(word));
        System.out.println(reverseString("huseyin"));


    }
    public static String reverseString(String str){
        String reverseString ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseString+=str.charAt(i);
        }
        return reverseString;
    }


}
