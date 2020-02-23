package day45;

public class Dog extends Animal {

//    public void speak(){
//        System.out.println("Bark!@@");
//    }



String color;
int awe;
double thg;

public Dog(){


    System.out.println("fsdgdf");
}

    @Override
    public void speak() {
    //super. can be used to specify we are calling
        //super class version method
        //can we use seper. or this. outside of instance method
        // BIG NO!!!!!!!!!!!!!!
        //it can only be used inside instance method
    super.speak();
    System.out.println("Bark!!");
    //we can use super. or this. as many time as we want
        super.speak();
        super.speak();


    }

    public static void main(String[] args) {
        Dog twix=new Dog();
        twix.speak();
    }

}
