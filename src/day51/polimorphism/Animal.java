package day51.polimorphism;

public class Animal {
    public void makeNoise(){
        System.out.println("general animal noise");
    }




}

// i can add more classes as long as only one class is public and name is as file name.
class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("woffff");
    }



}
class Horse extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("neineinei");
    }



}
