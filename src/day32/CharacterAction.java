package day32;

public class CharacterAction {
    public static void main(String[] args) {

printAtoZ();

CharacterAction.printAtoZ();
printZtoA();
printAlphabetInRange('a','f');
printAlphabetInRange('G','B');
        printAlphabetInRange('a','A');
        printAlphabetInRange('Z','a');


    }
  public static void printAtoZ(){   // print A to Z
      for (char iChar = 'A'; iChar <='Z' ; iChar++) {
          System.out.print(iChar+" ");
      }
      System.out.println();  //so we can move next line
  }
public static void printZtoA(){
    for (char iChar = 'Z'; iChar >='A' ; iChar--) {
        System.out.print(iChar+" ");
    }
    System.out.println();  //so we can move next line
    }
public static void printAlphabetInRange(char beginning,char ending){
        if(beginning<ending) {
            System.out.println("we need to increment from " + beginning + " till " + ending);

            for (char iChar = beginning; iChar <= ending; iChar++) {
                System.out.print(iChar + " ");

            }
            System.out.println();
        } else if(beginning>ending){
            System.out.println("we need to decrement from "+beginning+" till "+ending);
            for (char iChar=beginning ; iChar>=ending ; iChar--) {
                System.out.print(iChar + " ");
            }
            System.out.println();
        }else{
            System.out.println("they are same character");
        }
}






}




