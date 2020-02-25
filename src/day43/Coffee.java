package day43;

//a blueprint for coffee object
//with 3 constructors
//getters and setters
//price should never be less than 0
//no coffee object with minus price should be created
//no one should change the price
//to minus for any existing coffee object

public class Coffee {
    private String type;
    private int caffeinLevel;
    private double price;

    public Coffee(){
        //default constructor
    }
    public Coffee(String type,int caffeinLevel){
        this.type=type;
        this.caffeinLevel=caffeinLevel;

    }
   //wake up task to create 3 args constructor
    //do not let the price go 0
    //if it is less than 0 make it $1



    public Coffee(String type,int caffeinLevel,double price) {

            this.type = type;
            this.caffeinLevel = caffeinLevel;
//            if (price > 0) {
//                this.price = price;
//            } else {
//                this.price = 1;
//            }
        //we already ha va code to do above logic in setter
        //so we can call the method directly to avoid dublication
        //you can call any methods of same class in constructor
        setPrice(price);
        }

    public void setPrice(double price){
        if(price>0){
            this.price=price;
        }else{
            this.price=1.00;
        }
    }



    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public int getCaffeinLevel(){
        return caffeinLevel;
    }
    public void setCaffeinLevel(int caffeinLevel){
        this.caffeinLevel=caffeinLevel;
    }
    public double getPrice(){
        return price;
    }

    //we want to block the caller of this method
    //to set invalid price less than 0
    //if invalid we just set it to 1
    //for protection


    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeinLevel=" + caffeinLevel +
                ", price=" + price +
                '}';
    }
}

//package day43;
//
//public class Coffee {
//
//    private String type;
//    private int caffeineLevel;
//    private double price;
//
//    public Coffee() {
//        System.out.println("no arg constructor being called");
//    }
//
//    public Coffee(String type, int caffeineLevel) {
//        this.type = type;
//        this.caffeineLevel = caffeineLevel;
//        System.out.println("2 args constructor being called");
//    }
//
//    public Coffee(String type, int caffeineLevel, double price) {
//        this.type = type;
//        this.caffeineLevel = caffeineLevel;
//        // only set the value if the price is valid
//        if (price > 0) {
//            this.price = price;
//        } else {
//            this.price = 1;
//        }
//    }
//
//    public String toString() {
//        return "Coffee{" +
//                "type='" + type + '\'' +
//                ", caffeineLevel=" + caffeineLevel +
//                ", price=" + price +
//                '}';
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public int getCaffeineLevel() {
//        return caffeineLevel;
//    }
//
//    public void setCaffeineLevel(int caffeineLevel) {
//        this.caffeineLevel = caffeineLevel;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//}

