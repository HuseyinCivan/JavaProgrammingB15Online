package day58;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDepo {
    public static void main(String[] args)  {
        System.out.println("before try catch");
//        Files.readAllLines(Paths.get("file.txt"));

              try {

           Files.readAllLines(Paths.get("file.txt"));
       }catch (IOException e){
           System.out.println("Exception happen and caught");
        }
      System.out.println("after try catch");
              for (int x = 0; x<999999999; x++){
                  System.out.println(x);
              }
    }


}
