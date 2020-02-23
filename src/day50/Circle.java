package day50;
//				Cirlce
//					field : radius
//					instance methods : (implement all abstract methods)
//					toString method


public class Circle extends Shape {
    int radius;


    public Circle(String name,int radius) {
        super(name);
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
    area=Math.PI*radius*radius;
    }

    @Override
    public void draw() {
        System.out.println("draw bla bla ....");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +" color "+COLOR+
                '}';
    }
}
