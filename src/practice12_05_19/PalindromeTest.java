package practice12_05_19;

public class PalindromeTest {
    public static void main(String[] args) {


        String name="nur sesruN";
        String reversedName="";
        for(int x=name.length()-1; x>=0;x--){
            reversedName=reversedName+name.charAt(x);
            //System.out.print( name.charAt(x)+" "          );

        }
        System.out.println("reversedName = " + reversedName);
        System.out.println("__________________________________________");
        name=name.replace(" ","");
        reversedName=reversedName.replace(" ","");

        System.out.println("name = " + name);
        System.out.println("reversedName = " + reversedName);

        if(reversedName.equalsIgnoreCase(name)){

            System.out.println("Palindrome Test Has Passed" );
        }else{
            System.out.println("Palindrome Test Has Failed");
        }






    }
}
