package day52.polymorphism;

public class ShapePolymorphism {

    public static void main(String[] args) {

 //         Circle s1=new Circle("penny",5);
     //Shape s1=new Circle("penny",5);
      Object s1=new Circle("penny",5);
       // Drawable s1=new Circle("penny",5);

        //ONLY THE REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS WITH THAT VARIABLE

        //s1.draw();
        System.out.println(s1.toString());


        // how do i know what is the actual object type

        System.out.println("s1.getClass().getSimpleName() = " + s1.getClass().getSimpleName());





    }
    // create a method that accepts any shape and print out the calculate area

    public static void printAnyShapeArea(Shape anyShape){
        anyShape.calculateArea();
        System.out.println(anyShape.area);

    }



}
