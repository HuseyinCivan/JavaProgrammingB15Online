package day50;
//				Square
//					field : length
//					instance methods : (implement all abstract methods)
//					toString method
public class Square extends Shape{

    int length;
    // String name;
    // double area;

    public Square(String name,int length) {
        super(name);  //reusing functionality of super class
        this.length=length;

    }

    @Override
    public void calculateArea() {
        area=length*length;  //this is how we calculate area of square
        System.out.println("area of Square is  = " + area);
    }

    @Override
    public void draw() {
        System.out.println("draw 4 equal line with 90 degree ,  length "+length +" with color "+Drawable.COLOR);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}'+" color is "+COLOR;
    }
}
