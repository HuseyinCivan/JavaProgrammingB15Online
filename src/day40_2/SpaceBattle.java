package day40_2;

public class SpaceBattle {
    public static void main(String[] args) {

        SpaceShip s1=new SpaceShip();
        s1.name="Oregon";
        s1.currentDirection="right";
        s1.x=0;
        s1.y=0;

        //    public void setInitialPosition(int newX,int newY){

        //    public void setDirection(String newDirection){

        //    public void move1Block(){

        s1.setInitialPosition(5,3);
        s1.setDirection("right");
        s1.move1Block();

        System.out.println(s1);

        System.out.println("_____________________________________");

        s1.setDirection("dffdfg");
        s1.move1Block();
        System.out.println(s1);

        System.out.println("_____________________________________");

        s1.setDirection("up");
        s1.move1Block();
        System.out.println(s1);

        System.out.println("_____________________________________");
        s1.move1Block("down");
        System.out.println("s1 = " + s1);
        System.out.println("_____________________________________");
        s1.move1Block("right");
        System.out.println("s1 = " + s1);
        System.out.println("_____________________________________");
        s1.move1Block("left");
        System.out.println("s1 = " + s1);










    }
}
