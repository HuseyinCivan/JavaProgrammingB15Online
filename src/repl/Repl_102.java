package repl;

import java.util.Scanner;

public class Repl_102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();
        String id="";
//String html=" <!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>   ";
        if( html.contains("<html>")) {
            id=html.substring(  html.indexOf("id")+4 ,  html.indexOf(">",  html.indexOf("id")      )    );

        System.out.println(id);
    }

}
}
//<!DOCTYPE html><html><head><title>Test</title></head><body><div><a href="http://www.google.com" id="linkid">Clicki Here!</a></div></body></html>
//<!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
//System.out.println("Invalid input!");