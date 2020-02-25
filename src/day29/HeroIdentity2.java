package day29;

public class HeroIdentity2 {
    public static void main(String[] args) {


        String hero1="Superman-Clarke Kent";

        String[] heroSplited = hero1.split("-");
        //String herocode= heroSplited[0];
        String fullName=heroSplited[1];

        String stars="";

        for (int i = 1; i <=fullName.length() ; i++) {
            stars +="*";

        }
        System.out.println("stars = " + stars);

        String heroX=hero1.replace(fullName,stars);
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);


















    }
}
