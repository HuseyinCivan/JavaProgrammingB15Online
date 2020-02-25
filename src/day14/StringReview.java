package day14;

public class StringReview {
    public static void main(String[] args) {

        String str="I like Pumpkin";
        //System.out.println("str");
        //System.out.println(str);
        System.out.println("str = " + str);




        //        //System.out.println(str.equals("pumkin"));
//
//        // contains:
//        // it checks whether a string exists in another string
//        // and return true or false result
//        System.out.println("does it contain Pumpkin: ");
//        System.out.println(       str.contains("Pumpkin")         );
//
        boolean gotPumpkin = str.contains("Pumpkin");
        System.out.println("gotPumpkin = " + gotPumpkin);    //soutv yapinca !!1
//
//        // startsWith endsWith
//        //check whether a string start with another string
//        //check whether a string end with another string
//        // and return true or false result

        boolean startedWithI=str.startsWith("I");
        System.out.println("started With I = " + startedWithI);

        boolean endWithPumpkin=str.endsWith("Pumpkin");
        System.out.println("end With Pumpkin = " + endWithPumpkin);

        // PASSWORD VALIDATION

        // MINIMUM 8 CHAR MAX 16 CHAR
        //IT MUST CONTAIN _ OR $
        //IT MUST NOT CONTAINS SPACE
        //IT MUST START WITH Ab

        // if any of above condition does not match say INVALID PASSWORD
        // else say GOOD PASSWORD !

        String password="Ab_H23$723gfgdsu";
        // MINIMUM 8 CHAR MAX 16 CHAR
        boolean min8max16= password.length() >=8 && password.length()<=16;

        //IT MUST CONTAIN _ OR $
        boolean mustContain_Or$=password.contains("$") || password.contains("_");

        //IT MUST NOT CONTAINS SPACE
        boolean mustNotcontainsSpace= !password.contains(" ");

        //IT MUST START WITH Ab
        boolean startsWith= password.startsWith("Ab");

        if( min8max16 && mustContain_Or$ && mustNotcontainsSpace  && startedWithI   ){
            System.out.println("VALID PASSWORD");
        }else{
            System.out.println("INVALID PASSWORD");
        }




        
        


















    }
}
