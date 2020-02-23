package day45;

public class Apple extends Fruit {

    //if we dont have any constructor we will get default constructor
    //and compiler automaticaslly call
    //no arg constructor of super class by inserting super()

    public Apple(){

       super();
       //super("");
               System.out.println("appleapple");


    }
    public Apple(String s){
        super("jhh");
    }

    //first line of any constructor is automaticlly calling
    //super() if we dont call any
//    public Apple(){
        //i want to reuse the functionality
        // already written in superclass
        //we can super() or super(argument here)
        //to call super class's constructor
      // super();

        //how to call constructor with 1 argument
       // super("test");

        //can we use this super() call more than one?
        //NO !!!!
  //      System.out.println("Message from Apple Constructor");

  //  }

    public static void main(String[] args) {
        Apple a1=new Apple();
        System.out.println("=================");
        Apple a2=new Apple("gdf");

    }

}
