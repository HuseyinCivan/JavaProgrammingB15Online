package day42;

public class Computer {

    private String brand;
    private int ram;
    private double price;

    //behaviour

    // runProgram
    //---> print brand is runnong program with the ram

    public void runProgram(){
        System.out.println(this.brand+" is running with the "+this.ram+" ram");
    }

    //calculate
    //----> print brand is calculating

    public void calculate() {
        System.out.println(brand+" is calculating");

    }
    //add getters and setters to all the fields

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        //valid ram is 1-128
        if(ram>=1 && ram<=128){
            this.ram = ram;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 20) {
            this.price = price;
        }
    }


    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    //ram can not be less than 1 more than 128
    //price can not be less than 20 a
    //add toString method
















}
