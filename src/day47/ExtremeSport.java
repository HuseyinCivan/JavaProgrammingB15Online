package day47;

public class ExtremeSport extends Sport {


//   public void doSomething() {
//        //super.doSomething();
//        System.out.println("Doing extreme sport");
//    }

    @Override
    public final void doSomethingElse() {
       // super.doSomething();
       // super.doSomethingElse();
        System.out.println("doing something else in extreme sport");
    }


    public static void main(String[] args) {
ExtremeSport e1=new ExtremeSport();
e1.doSomething();
e1.doSomethingElse();


    }
}