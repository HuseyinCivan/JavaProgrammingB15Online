package day15;

public class ReversesingAString {
    public static void main(String[] args) {


        String name = "Huseyin";

        System.out.println(name.charAt(0)+" "+name.charAt(1)+" "+
                name.charAt(2)+" "+name.charAt(3)+" "+name.charAt(4)+" "+name.charAt(5)+" "+name.charAt(6));

        System.out.println(name.charAt(6)+" "+name.charAt(5)+" "+
                name.charAt(4)+" "+name.charAt(3)+" "+name.charAt(2)+" "+name.charAt(1)+" "+name.charAt(0));




        //how do you fond out last character of any String
        //counting character start with one
        //counting index(location ) start with 0
        //so last character index/location  will be always one less than actual character count

        //akbar has 5 character
        //01234 and last charracter index is 4 not 5   5-1=4

        int nameLength=name.length();

        System.out.println(name.charAt(nameLength-1));

        System.out.println(name.charAt(name.length()-1));




    }
}
