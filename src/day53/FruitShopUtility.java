package day53;

public class FruitShopUtility {


    public static void main(String[] args) {

        Fruit fx = null;




        Fruit f1= new Apple("sweet","red","Fuji");
        Fruit f2= new Apple("crispy but tasteless","red hot","Gala");

        displayFruit(f1);
        displayFruit(f2);
        displayFruit(new Apple("crispy but tasteless","red hot","Gala"));
//can we directly pass any object IS-A Fruit rather than saving it into variable


        System.out.println("-----------------digest better call---------------");

        //digestBetter(f2);
        //digestBetter(new Orange("sweet","yellowish",1));
        System.out.println("-----------------my favorite fruit call call---------------");
        Fruit x=getMyFavoriteFruit();
        x.getDigested();
        System.out.println("B15 favorite fruit = " + x);

        System.out.println("-----------------GetFavoriteByType---------------");

        System.out.println("GetFavoriteByType(1) = " + GetFavoriteByType(1));
        System.out.println("GetFavoriteByType(2) = " + GetFavoriteByType(2));
        System.out.println("GetFavoriteByType(3) = " + GetFavoriteByType(3));





    }

    public static Fruit getMyFavoriteFruit(){
        //Fruit f=new Orange("crispy","green",100);
        //Fruit f=new Apple("Sweet","blue","Ginger");
        //return f;
        return new Apple("Sweet","blue","Ginger");
    }

    //create a static method called GetFavoriteByType
    //it has one int parameter
    //return favorite apple object if type is 1 , orange object if type 2

    public static Fruit GetFavoriteByType(int x){
        if(x==1){
            return new Apple("Sweet","blue","Ginger");
        }if(x==2){
            return new Orange("crispy","green",100);
        }
        //we can return null for any method that return reference type
        //because null can be assigned to a reference type variable
        return null;
    }





    //create a method called digestBetter
    //it accept a Fruit as a parameter
    //and inside the method, it will digest the fruit object 4 time then displayInformation


    public static void digestBetter(Fruit anyFruit){
        for (int i = 0; i <4 ; i++) {
            anyFruit.getDigested();
        }
        displayFruit(anyFruit);
    }

    //create a static method called getMyFavoriteFruit
    //accept no parameter and return your Favorite Fruit Object




    //displayFruit
    public static void displayFruit(Fruit anyFruit){
        System.out.println("Displayin fruit \n"+anyFruit.toString());
    }

    //sellFruit



    //buyFruit











}
