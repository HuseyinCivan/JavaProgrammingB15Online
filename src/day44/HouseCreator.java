package day44;

public class HouseCreator extends CyberHouse {
    public HouseCreator(int houseNum, String design) {
        super(houseNum, design);
    }

    public static void main(String[] args) {

        CyberHouse h1 = new CyberHouse(12, "Modern");
        CyberHouse h2 = new CyberHouse(41, "Victorian");
        CyberHouse h3 = new CyberHouse(7, "ArtDeco");
        CyberHouse h4 = new CyberHouse(15, "Colonial");

        h1.showAllInfo();
        CyberHouse.setNeighbourhoodName("Brooklyn");
        CyberHouse.showNeighbourhood();

        h2.showAllInfo();

        CyberHouse.showNeighbourhood();

        System.out.println(CyberHouse.getNeighbourhoodName());


        //how do i get the max value of Short

        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);






    }
}
