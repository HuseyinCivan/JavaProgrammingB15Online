package day52.polymorphism;


//public static void printShapeArea(Shape anyShape){
//    anyShape.calculateArea();
//    System.out.println(anyShape.name+" 's area is = "+anyShape.area);
//}   mehtap erguven bak !!!

public class ShapePolymorphism2 {

    public static void main(String[] args) {

 //         Circle s1=new Circle("penny",5);
     Shape s1=new Circle("penny",5);

printAnyShapeArea(s1);

Shape s2=new Rectangle("Book",10,5);

printAnyShapeArea(s2);

printAnyShapeArea(new Square("Bob",6));

drawShape3Times(s1);





    }
    //create a static method called drawShape3Times
    //it has Shape as parameter
    //return nothing
    //it will draw the shape 3 times

    public static void drawShape3Times(Shape anyShape){

        anyShape.draw();
        anyShape.draw();
        anyShape.draw();


    }


    // create a method that accepts any shape and print out the calculate area

    public static void printAnyShapeArea(Shape anyShape){
    anyShape.calculateArea();
    System.out.println(anyShape.name+" 's area is = "+anyShape.area);

    }



}
