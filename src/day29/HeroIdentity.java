package day29;

import java.util.Arrays;

public class HeroIdentity {
    public static void main(String[] args) {


        String hero1="Superman-Clarke Kent";

        // hide this hero identity

       // String heroX="Superman-***********";

        //given a string with hero code and name seperated by -
        //turn this String into hero code and * with same length as hero name

        // plain english logic
        //split it by - to get the code and full name
        // get the length of last name
        //generate stars with same length as full name character count
        // concatenate hero code with dash and stars and save it

        String[] heroSplited = hero1.split("-");
        String herocode= heroSplited[0];
        String fullName=heroSplited[1];

        int nameCount=fullName.length();
        String stars = "";

        for (int i = 0; i <nameCount ; i++) {
            stars=stars+"*";

        }
        System.out.println("fullName = " + fullName);
        System.out.println("stars = " + stars);


//        String[] arrHero1=hero1.split("-");
//
//       String star="";
//        for (int x = 0; x <arrHero1[arrHero1.length-1].length() ; x++) {
//        star=star+"*";
//        }
//        System.out.println("star = " + star);
//
//        arrHero1[arrHero1.length-1]=star;
//
//        System.out.println("arrHero1 = " + Arrays.toString(arrHero1));

         String heroX=herocode+"-"+stars;
        System.out.println("heroX = " + heroX);













    }
}
