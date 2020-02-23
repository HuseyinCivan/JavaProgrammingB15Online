package practice02_17_20;

public class Labeling {
    public static void main(String[] args) {

        int[][] list = {{1,13,5},{1,2,5},{2,7,8}};

        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

    for(int i=0; i<list.length; i++) {
            for(int j=0; j<list[i].length; j++) {
                if(list[i][j]==searchValue) {
                    positionX = i;
                    positionY = j;
                  //  break PARENT_LOOP;

                 }
            }
        }
        if(positionX==-1 || positionY==-1) {

            System.out.println("Value "+searchValue+" not found");
        } else {
            System.out.println("Value "+searchValue+" found at: " + "("+positionX+","+positionY+")");
        }



        try{
            int a=3;
            int b=0;
            System.out.println(a / b);
        }catch (Exception e){
            System.out.println("yeap");
            String s =  "seda";
        //    System.out.println(s.charAt(38));
        }finally {
            System.out.println("will be or not");
        }

    }
}

