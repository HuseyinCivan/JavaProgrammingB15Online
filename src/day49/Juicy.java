package day49;

// Interface can achieve loosely coupling between implementing classes
// for example : When we say flyable
// all the implementing classes like Plane , Insects, Superman ....
// can be all Flyable and has nothing to do with each other
// and almost no knowledge about each other : known as loosely coupling
// This is why it's always preferred in design
public interface Juicy {
    public abstract void melt();

    //
    //
    //
    //
    //
    public static void squeeze(){
        System.out.println("static squeezing ");
    }
}
