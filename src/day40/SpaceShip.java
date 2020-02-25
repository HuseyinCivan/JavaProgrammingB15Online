package day40;
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
public class SpaceShip {

        String name;
        String currentDirection;  //up , down , right , left
        int x;
        int y;


        public void setInitialPosition(int newX,int newY){

            x=newX;
            y=newY;

    }
    public void setDirection(String newDirection){
        //accept to set the direction
        //up , down , right , left
        if(newDirection.equalsIgnoreCase("up")|| newDirection.equalsIgnoreCase("down")||
           newDirection.equalsIgnoreCase("right")||newDirection.equalsIgnoreCase("left")   ){
            currentDirection=newDirection;
        }else{
            System.out.println("INVALID DIRECTION!!");
            currentDirection="";
        }

    }
//move the spaceship to 1 block according to current direction
    public void move1Block(){
        //change the position according to the direction

        //currentDirection can not be null
        //or it will throw an exception
        switch (currentDirection){
            case  "right" :
                x +=1;
                break;
            case  "left" :
                x -=1;
                break;
            case  "up" :
                y +=1;
                break;
            case  "down" :
                y -=1;
                break;
            default:
                break; }


    }

    //add a functionality to move1Block with direction provided in one shot
    public void move1Block(String newDirection){
            setDirection(newDirection);
            move1Block();
    }




    //right click-generate-toString-select all-delete overwrite
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

