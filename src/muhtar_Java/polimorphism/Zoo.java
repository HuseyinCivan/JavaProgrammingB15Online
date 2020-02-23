package muhtar_Java.polimorphism;

class Animal{
    public void talk(){
        System.out.println("Animal is talking");
    }

}
class Tiger extends Animal{

    public void hunt(){
        System.out.println("tiger is hunting");
    }
    public void talk(){
        System.out.println("tiger is talking ==> roar");
    }


}

class Octopus extends Animal{
    public void swim(){
        System.out.println("octopus is swimming");
    }
   public void talk(){
       System.out.println("octopus is talking ===> gologolo");
   }

}


public class Zoo {
    public static void main(String[] args) {
        Tiger tiger1=new Tiger();

        Tiger[] tigers={  tiger1, new Tiger()   };



        Octopus octopus1=new Octopus();

        Octopus[] octopus= { octopus1,new Octopus() };

        Animal             animal1           =new Tiger();
//      reference type     reference name       object
       Animal              animal2          =new Octopus();

        Octopus              animal2_       =new Octopus();

        animal1.talk();
      //  animal1.hunt();   --->  hunt method is not exist in the reference type so it does not let us to call

       //animal2.swim();
        animal2_.swim();

        animal2.talk();






    }

}
