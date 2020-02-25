package day40_2;

public class SpaceShip {

    //Create a class called SpaceShip
//it has 4 attributes :
//	name as String
//	currentDirection as String  | up , down , right, left
//	xCordinate as int
//	yCordinate as int
// few behaviours :
// 	 setInitialPosition
// 	 	accept 2 int parameters
// 	 	to provide initial position of spaceship
// 	 setDirection  void method
// 	 	accept 1 String parameter to set the direction
// 	 move1Block    void method
// 	 	accept no parameter
// 	 	and change the position according to the direction
// 	 toString method
// 	 	return String reperesntation of Spaceship Object

    String name;
    String currentDirection;
    int x;
    int y;

    public void setInitialPosition(int newX,int newY){

        x=newX;
        y=newY;
    }

    public void setDirection(String newDirection){
        if(newDirection.equalsIgnoreCase("up") ||  newDirection.equalsIgnoreCase("down") ||
                newDirection.equalsIgnoreCase("right") || newDirection.equalsIgnoreCase("left" )){
            currentDirection=newDirection;

        }else{
            currentDirection="Invalid";

        }

    }
    public void move1Block(){
        if(currentDirection.equalsIgnoreCase("up")){
            y++;
        }if(currentDirection.equalsIgnoreCase("down")){
            y--;
        }if(currentDirection.equalsIgnoreCase("right")){
            x++;
        }if(currentDirection.equalsIgnoreCase("left")){
            x--;
        }if(currentDirection.equalsIgnoreCase("Invalid")){
            x=x;
            y=y;
        }

    }

    public void move1Block(String newDirection){
        setDirection(newDirection);
        move1Block();
    }


    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
