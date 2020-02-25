package day12;



public class ChekingStringEqualityWithoutCase {
    public static void main(String[] args) {

        String userName="aBc123";
        //storing the result of equality check into boolean variable
        boolean userNameCorrect=userName.equals("ABC123");
        //printing the variable to see what it is
        System.out.println(userNameCorrect);
        //storing the result of equality check without caring about case into boolean variable
        boolean userNameCorrect2=userName.equalsIgnoreCase("ABC123");
        //printing the variable to see what it is
        System.out.println(userNameCorrect2);

        //store your name is a name variable
        //check for equality using different uppercase lowercase example
        //using equals and equalsIgnoreCase

//        String name="HuSeyIn";
//        System.out.println(name.equals("hUseyin"));
//        System.out.println(name.equalsIgnoreCase("huseyin"));

        String name="HuSeyIn";
        boolean nameEqualsWithoutCase=name.equalsIgnoreCase("huseyin");
        //System.out.println(name.equalsIgnoreCase("HUSEYin"));
        System.out.println(nameEqualsWithoutCase);










    }
}
