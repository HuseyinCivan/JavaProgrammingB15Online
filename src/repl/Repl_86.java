package repl;

import java.util.Scanner;

public class Repl_86 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

////Please enter guest name:
////Nick
////Do you want to enter new guest name:
////yes
////Please enter guest name:
////Linda
////Do you want to enter new guest name:
////no
////
////Guest's list: Nick, Linda

        String guestName="";
        //String wantToAddNewGuest="";
        String newGuestName="";
       //    String guestList="";

        System.out.println("Please enter guest name:");
        guestName=scan.nextLine();
        System.out.println("Do you want to enter new guest name:");
        newGuestName=scan.nextLine();

        if(newGuestName.equalsIgnoreCase("yes")){
            do{
                System.out.println("Please enter guest name:");

                guestName+=", "+scan.nextLine();
                System.out.println("Do you want to enter new guest name:");
                newGuestName=scan.nextLine();
            }while(newGuestName.equalsIgnoreCase("yes"));

        }
        System.out.println("Guest's list: "+guestName);
    }
}



//     do{
//         System.out.println("Please enter guest name:");
//         guestname=scan.nextLine();
//         guestname += ", " + newGuest;
//         System.out.println("Do you want to enter new guest name:");
//         wantToAddNewGuest=scan.nextLine();
//
//if(wantToAddNewGuest.equalsIgnoreCase("yes")) {
//
//    System.out.println("Please enter guest name:");
//    newGuest = scan.nextLine();
//    guestname += ", " + newGuest;
//    System.out.println("Do you want to enter new guest name:");
//    wantToAddNewGuest=scan.nextLine();
//}else{
//    System.out.println("Guest's list: "+guestname);
//}
//
//}while(wantToAddNewGuest.equals("yes"));
//
//        System.out.println("Guest's list: "+guestname);

