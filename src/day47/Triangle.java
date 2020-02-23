package day47;

public class Triangle extends Shape {

//    String name;
//    int area;
    int height;
    int base;

    @Override
    public void calculateArea() {
        area=height*base/2;
        System.out.println("the area is "+area);
    }

    public Triangle(String name, int height, int base) {
        // i want to set the name to word Rectangle
        //i am reusing the functionality of super class
        //to set the name to rectangle
        super("Triangle");
        this.height = height;
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }


}

