package day48;
// a class can implement more than one interface

public class Kangaroo implements Bouncible, BoxerWithBellyPouch {
    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }
    public void eat(){
        System.out.println(name+" Kangaroo is eating");
    }

    //this is the method we have override from BoxerWithBellyPouch interface
    @Override
    public void kickBox() {

        System.out.println("kangaroo with name "+name+" is boxing");
    }
    //this is the method we have override from BoxerWithBellyPouch interface
    @Override
    public void carryChildInThePocket() {

        System.out.println("kangaroo with name "+name+" is carrying child in the pocket");
    }
    //this is the method we have override from Bouncible interface
    @Override
    public void bounce() {
        System.out.println(name+" Kangaroo is bouncing");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +" Gravity = "+GRAVITY+
                '}';
    }


}

//
