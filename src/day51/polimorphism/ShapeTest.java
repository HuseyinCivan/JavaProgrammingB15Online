package day51.polimorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {

        Shape s1=new Triangle();
        Shape s2=new Rectangle();
        Shape s3=new Circle();




        s1.draw();
        s2.draw();
        s3.draw();


//// please create Array of shape to store
//// 5 concrete Shape Object
//// and call the draw the method on each of them
//// Also try to create ArrayList of Shape
//// and store 4 concrete Shape objects
//// and call the draw method on each of them

        //// Create a different class with main method:
        //// and try to use the Shape, Circle, Triangle class from day 50
        //// Create list of Shape and calculate their area

        Shape[] allShapeObj={s1,s2,s3,new Triangle(),s2};

        for (Shape eachShape : allShapeObj) {
            eachShape.draw();
        }

        for (int x = 0; x <allShapeObj.length ; x++) {
            allShapeObj[x].draw();
        }


        List<Shape> lstShapes=new ArrayList<>();
        for (int x = 0; x <allShapeObj.length ; x++) {

            lstShapes.add(allShapeObj[x]);
        }

        for (int x = 0; x <lstShapes.size() ; x++) {
            lstShapes.get(x).draw();
        }





        //quick way to create a list ---> can we add or remove item from this short way ? no !!!

        List<Shape> shapeList= Arrays.asList(s1,s2,s3,s2,s1);



        }



















    }

