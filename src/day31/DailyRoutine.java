package day31;

public class DailyRoutine {

public static void wakeUp(){
        System.out.println("open your eyes");
        System.out.println("close your eye");
        System.out.println("hear your alarm ? open it again ");
        System.out.println("----------------------");

    }
public static void drinkCoffee(){
    System.out.println("put coffee in your coffee machine");
    System.out.println("press the button make your coffee");
    System.out.println("---------------------------------");

}
public static void prepareKidsForSchool(){
    System.out.println("kiss your kids to wake them up");
    System.out.println("wake them up for 10 times");
    System.out.println("prepare their breakfast and lunch");
    System.out.println("eat with them ");
    System.out.println("----------------------");

}

public static void takeThemToSchool(){
    System.out.println("take them to school bus");
    System.out.println("say good bye");
    System.out.println("---------------------");
}
public static void studyJava(){
    System.out.println("think about Java waking up");
    System.out.println("think about java drinking coffee");
    System.out.println("think about java preparing kids for school");
    System.out.println("eventually sit down and study java, practice,paractice,practice");
    System.out.println("review last classes, come ready for the class");
    System.out.println("---------------------");
}
public static void sayILoveJava300Times(){
    for (int i = 1; i <=300 ; i++) {
        System.out.print("i love Java"+" ");
    }
}


    public static void main(String[] args) {
wakeUp();
drinkCoffee();
prepareKidsForSchool();
takeThemToSchool();
studyJava();
sayILoveJava300Times();



     /*
         * wakeUp
         * drinkCoffee
         * prepareKidsForSchool
         * goToWork
         * groceryShopping
         * cooking
         * studyJava
         * goToSleep
         */




    }
}
