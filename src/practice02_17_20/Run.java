package practice02_17_20;

abstract class XAble implements Walk,Run,Win {



        }



public interface Run {
     public abstract void abc();

     public static void aaa(){

     }
     public default void bbb(){

     }


}


interface Win extends Run {
    public abstract void def();
}

interface Walk extends Win{
    public abstract void ghi();
}
class Dog implements Walk{

    @Override
    public void abc() {

    }

    @Override
    public void def() {

    }

    @Override
    public void ghi() {

    }

}



