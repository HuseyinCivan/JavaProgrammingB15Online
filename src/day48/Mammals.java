package day48;


//Mamals are extending  superclass Animal
//and yet Mammal is another Abstract class itself

public abstract class Mammals extends Animal{

    //if the subclass of abstract super class is also abstract,
    //yiu are not required to provide body or abstract method
    //because abstract class can have abstract method
    //YOU CAN OPTIONALLY PROVIDE A BODY
    //
    // public abstract void makeNoise();

    public abstract void drinkMilk();



}
