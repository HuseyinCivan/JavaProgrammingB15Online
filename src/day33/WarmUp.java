package day33;

public class WarmUp {
    public static void main(String[] args) {

        /*
         * getSpelledName
         * this method will put dash in between giving String
         * for example---> A-k-b-a-r
         * @param name this is the name parameter
         * @return the name has dash in between
         *
         *
         * */

     String spelledName=   getSpelledName("Seda");
        System.out.println("spelledName = " + spelledName);

        System.out.println(getSpelledName("Sedeeee"));

        System.out.println(getSpelledName2("huseyin"));
    }

    public static String getSpelledName(String name) {

        String result = "";
        for (int i = 0; i < name.length(); i++) {
            result = result + name.charAt(i);
            // if( name.charAt(i)!=name.charAt(name.length()-1)  ){
            if (i != name.length() - 1) {
                result = result + "-";
            }
        }
        return result;
    }
    public static String getSpelledName2(String name) {
        String result = "";
        //keep adding dash until right before last character
        //then concatenate last character

        for (int i = 0; i < name.length()-1; i++) {
            result+=name.charAt(i)+"-";
        }
        result+=name.charAt(name.length()-1);
        return result;
}



}

