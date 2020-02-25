package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {
       //
       //
       //
       //
       //

      // Ayra

      /*
        Ay
        yr
        ra

        */
        String name="Ayra";
        int lastCharacterIndex=name.length()-1;

        for(int x=0;x<=lastCharacterIndex-1;x++){
            System.out.println(name.substring(x,x+2));

        }









    }
}
