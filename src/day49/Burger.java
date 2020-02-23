package day49;

// you are biulding super-sub relationship ,IS-A relationship

public class Burger extends Object implements Edible ,Juicy {

    // public static  boolean IS_HUMAN_FOOD=true;
    public Burger(){
        super();
    }
//    public Burger(int x){
//        System.out.println("eat "+x+" burger");
//    }

    @Override
    public void eat() {
        System.out.println("Eating burger with big bite");
    }

    @Override
    public void drink() {
        System.out.println("Eat burger then drink Soda");
    }

    @Override
    public void melt() {
        System.out.println("Juicy burger is melting ");
    }
}
