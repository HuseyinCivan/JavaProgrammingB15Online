package muhtar_Java.finalKeyword;

public class Cat extends Animal {

        public static void testClassMethod() {
            System.out.println("The static method in Cat");
        }
        public void testInstanceMethod() {
            System.out.println("The instance method in Cat");
        }



        public static void main(String[] args) {
            Cat myCat=new Cat();
           Animal myAnimal=myCat;
           Animal.testClassMethod();        //The static method in Animal
           myAnimal.testInstanceMethod();   //The instance method in Cat
           Cat.testClassMethod();           //The static method in Cat
           Animal.testClassMethod();        //The static method in Animal
           myCat.testInstanceMethod();      //The instance method in Cat




        }
    }


