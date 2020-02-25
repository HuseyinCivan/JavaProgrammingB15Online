package day44;

public class CyberHouse {

    int houseNum;
    String design;

    //we can change the default value of the fields
    //by assigning value directly in the template class
    private static String neighbourhoodName="CyberTek Ave";


    //constructor can access anything
    public CyberHouse(int houseNum,String design){
        this.houseNum=houseNum;
        this.design=design;

    }

    //instance method can access anything
    public void showAllInfo(){
        System.out.println("house num is "+houseNum+" design is "+design+" neighbourhood is "+neighbourhoodName);
    }

    public static void showNeighbourhood(){
        System.out.println("neighbourhoodName = " + neighbourhoodName);
        //System.out.println("CyberHouse.houseNum = " + houseNum); does not work!!!
        //static method can only access static members of same class

        //try to access houseNum, design and see what happen
    }

    public static void setNeighbourhoodName(String neighbourhoodName) {
        CyberHouse.neighbourhoodName = neighbourhoodName;
    }

    public static String getNeighbourhoodName() {
        return neighbourhoodName;
    }


}
