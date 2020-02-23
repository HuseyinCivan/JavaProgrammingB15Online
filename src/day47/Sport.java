package day47;

//cannot extend final class
//public final class Sport{  }

public class Sport {
    //final method can not be overridden in sub class
    public final void doSomething(){
        System.out.println("doing regular sport");
    }
    public void doSomethingElse(){
        System.out.println("something else");
    }

}
