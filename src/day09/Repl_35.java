package day09;
import java.util.Scanner;
public class Repl_35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        int iHave=100;
        int smartPhonePrice=300;
        int laptopPrice=400;
        int chargerPrice=15;
        int usbCablePrice=10;
        int headphonesPrice=30;
        int pantsPrice=50;
        int hatPrice=25;
        int socksPrice=5;
        int blanketPrice=60;
        int pillowPrice=40;

        if(item.equals("Smartphone")) {

        if(iHave -smartPhonePrice >= 0) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (iHave - smartPhonePrice) + "$");
        }else if(iHave -smartPhonePrice < 0) {
                System.out.println("Sorry, not enough funds on your gift card!");
        }}

       else if(item.equals("Laptop")) {
        if(iHave -laptopPrice >= 0) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (iHave - laptopPrice) + "$");
        }else if(iHave -laptopPrice < 0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            }}

        else if(item.equals("Charger")) {
        if(iHave -chargerPrice >= 0) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (iHave - chargerPrice) + "$");
        }else if(iHave -chargerPrice < 0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            }}
        else if(item.equals("USB cable")) {
        if(iHave -usbCablePrice >= 0) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (iHave - usbCablePrice) + "$");
        }else if(iHave -usbCablePrice < 0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            }}
        else if(item.equals("Headphones")) {
        if(iHave -headphonesPrice >= 0) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (iHave - headphonesPrice) + "$");
        }else if(iHave -headphonesPrice < 0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            }}
        else if(item.equals("Pants")) {
        if(iHave -pantsPrice >= 0) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (iHave - pantsPrice) + "$");
        }else if(iHave -pantsPrice < 0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            }}
        else if(item.equals("Hat")) {
        if (iHave - hatPrice >= 0) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (iHave - hatPrice) + "$");
        }else if (iHave - hatPrice < 0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            }}
                else if (item.equals("Socks")) {
                    if (iHave - socksPrice >= 0) {
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (iHave - socksPrice) + "$");
                } else if (iHave - socksPrice < 0) {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }}
                else if (item.equals("Blanket")) {
                if (iHave - blanketPrice >= 0) {
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (iHave - blanketPrice) + "$");
                } else if (iHave - blanketPrice < 0) {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }}
                else if (item.equals("Pillow")) {
                if (iHave - pillowPrice >= 0) {
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (iHave - pillowPrice) + "$");
                }else if (iHave - pillowPrice < 0) {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }}
                 else {
                    System.out.println("Invalid item!");
                }

            }
        }