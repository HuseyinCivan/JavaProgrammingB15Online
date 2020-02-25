package day43;

//Pet
//  attributes
//		type
//		name
//  constructor :
//  		no arg constructor
//  			set the breed to "unknown"
//  			set the name to "noname"
//  		2 args constructor
//  			set the name and breed to what the caller passed
// behaviours
// 		getters , setters , toString
// 		speak
// 			accept no parameter
// 			according to the type speak following
// 				cat --> meow
// 				dog --> woof
// 				cow --> mooo
// 				horse --> neinei


public class Pet {
    private String type;
    private String name;

    public Pet(){
        type="noname";
        name="noname";
    }

    public Pet(String type,String name){
        this.type=type;
        this.name=name;

    }

    public String getType() {
        return type;
    }

    public void setType(String breed) {
        this.type = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "breed='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void speak(){
//        if(type.equals("cat")){
//            System.out.println("meow");
//        }
//        if(type.equals("dog")){
//            System.out.println("woof");
//        }
//        if(type.equals("cow")){
//            System.out.println("mooo");
//        }
//        if(type.equals("horse")){
//            System.out.println("neinei");
//        }

        switch (type.toLowerCase()){
            case "cat":
                System.out.println("meow");
                break;
            case "dog":
                System.out.println("woof");
                break;
            case "horse":
                System.out.println("neinei");
                break;
            case "cow":
                System.out.println("mooo");
                break;
            default:
                System.out.println("Unknown Animal");

        }

    }
    //if your method does not read or modify object atttribute
    //you can just make it static

    public static void showGeneralPetInfo(){
        System.out.println("pets are friend of humans");

        //this will not work
        //static method can not access anything non-static
        //System.out.println(name);
    }


}
