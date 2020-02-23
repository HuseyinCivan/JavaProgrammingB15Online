package day54;

public class Clothes implements Wearable {
    int size;

    public static void main(String[] args) {

        //try out all the polymorphic assignment
        //according to these relationship

   Wearable w1=new Watch();
   Object w2=new Watch();
   Watch w3=new Watch();

   Wearable p1=new Perfume();
   Cosmetics p2=new Perfume();
   Object p3=new Perfume();
   Perfume p4=new Perfume();


   Wearable m1=new MakeUps();
   Cosmetics m2=new MakeUps();
    Object m3=new MakeUps();
    MakeUps m4=new MakeUps();

    Clothes c1=new Clothes();
    Wearable c2=new Clothes();
    Object c3=new Clothes();


    }


    @Override
    public void wear() {
        System.out.println("wearing Clothes");
    }
}
class Watch implements Wearable{


    @Override
    public void wear() {
        System.out.println("wearing Watches");

    }
}

class Perfume implements Wearable,Cosmetics {


    @Override
    public void wear() {
        System.out.println("wearing Perfumes");

    }
}

class MakeUps implements Wearable,Cosmetics {


    @Override
    public void wear() {
        System.out.println("wearing Makeups");

    }
}




