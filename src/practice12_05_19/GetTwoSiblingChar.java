package practice12_05_19;

public class GetTwoSiblingChar {
    public static void main(String[] args) {

        String name= "Arya";
        int lastIndex= name.length()-1;

        for(int x=0;x<=lastIndex-1;x++){
            System.out.println(name.substring(x,x+2));
        }

        for(int x=0;x<=lastIndex-2;x++){
            System.out.println(name.substring(x,x+3));
        }














    }
}
