package office_hour;

public class Practic_11_27 {
    public static void main(String[] args) {

    String message = "    I LOVE  JAVA   ";
    //trim

        System.out.println("message <= " + message+">");
        String messageTrimmed=message.trim();
        System.out.println("messagetrimmed <= " + messageTrimmed+">");

        //isEmpty

        String emptySpaces="                  ";
        System.out.println("emptySpaces <= " + emptySpaces+">");
        System.out.println(emptySpaces.isEmpty());
        System.out.println(emptySpaces.isBlank());
        String emptySpacesAfterTrimmed=emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed =<" + emptySpacesAfterTrimmed+">");










    }
}
