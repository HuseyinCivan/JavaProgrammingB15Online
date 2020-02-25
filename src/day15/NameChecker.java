package day15;

public class NameChecker {
    public static void main(String[] args) {

      String name="Huseyin";
      if(name.length()<4){
          System.out.println("short name");
      }else if(name.length()>3 && name.length()<11){
          System.out.println("medium name");
      }else if(name.length()>11){
          System.out.println("longer name");
      }

      if(name.contains("a")|| name.contains("e")){
          System.out.println("name contains a or e ");
      }else{
          System.out.println("i don't have both a or e in my name");
      }

      //print your name in reverse order !!!

        System.out.println(name.charAt(6)+""+ name.charAt(5)+""+name.charAt(4)+""+name.charAt(3)+""+name.charAt(2)+""+name.charAt(1)+""+  name.charAt(0));










    }
}
