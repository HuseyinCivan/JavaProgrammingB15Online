package day47;

public abstract class Shape {
    String name;
    int area;

    public Shape(String name){
        this.name=name;

    }
    // add a constructor to set these name value
    // add a abstract void method called calculateArea
    public abstract void calculateArea();

    public abstract String toString();

}
//  add two concrete class of Shape :
//  Triangle
//      instance fields : int height and base
// constructor
//        to set name , height , base
//        implements calculateArea method   area = height * base / 2
// add toString method
//
//  Rectangle
//      instance fields : width and height
//      implements calculateArea method   area = height * width
//      add toString method