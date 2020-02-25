package day21;

public class WakeUpTest_NamePrinter {
    public static void main(String[] args) {
        String name="My name is Huseyin";

        String msj="";
        for(int x=0;x<=name.length()-1;x++){
        msj=name.substring(x,x+1)+"->";
        System.out.print(msj);

    }

        System.out.println();

        System.out.println("________________________________");
        for(int x=0;x<=name.length()-2;x++) {
            msj = name.substring(x, x + 2) + "->";
            System.out.print(msj);
        }
        System.out.println();

        System.out.println("________________________________");
        for(int x=0;x<=name.length()-3;x++) {
            msj = name.substring(x, x + 3) + "->";
            System.out.print(msj);
        }
        System.out.println();

        System.out.println("________________________________");
        for(int x=0;x<=name.length()-4;x++) {
            msj = name.substring(x, x + 4) + "->";
            System.out.print(msj);

        }
        System.out.println();

        System.out.println("________________________________");
}
}