package repl;
import java.util.Enumeration;
import java.util.Scanner;
public class Repl_84 {
    public static void main(String[] args) {

                int freeBooks = 0;
                Scanner scan = new Scanner(System.in);
                boolean isPremiumCustomer = scan.nextBoolean();
                int nbooksPurchased = scan.nextInt();
                int twoFreeBooks,oneFreeBook;

                //    Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more books and
        //    offers 2 free books with every purchase of 8 or more books.
        //    It offers regular customers 1 free book with every purchase of 7 or more books,
        //    and offers 2 free books with every purchase of 12 or more books.
        //     Write a program that assigns freeBooks the appropriate value based on the values of the
        //     boolean variable isPremiumCustomer and the int variable nbooksPurchased.
        //     Print amount of freeBooks into the console.

        if(isPremiumCustomer){
           twoFreeBooks= nbooksPurchased/8;
           oneFreeBook= (nbooksPurchased - ( 8*twoFreeBooks))/5;
            freeBooks=2*twoFreeBooks + oneFreeBook;
            System.out.println(freeBooks);
        }else if (!isPremiumCustomer){
            twoFreeBooks=nbooksPurchased/12;
            oneFreeBook=(nbooksPurchased-(12*twoFreeBooks))/7;
            freeBooks=(2*twoFreeBooks)+oneFreeBook;
            System.out.println(freeBooks);

        }

    }
}
