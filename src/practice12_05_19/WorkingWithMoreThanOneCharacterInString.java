package practice12_05_19;

public class WorkingWithMoreThanOneCharacterInString {
    public static void main(String[] args) {

String name="Gokyuzum";
int indexofLast=name.length()-1;

for(int x=0;x<=indexofLast-1;x=x+2){
    System.out.println(name.substring(x,x+2));
}









    }
}
