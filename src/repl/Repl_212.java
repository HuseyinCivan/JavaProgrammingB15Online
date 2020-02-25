package repl;

public class Repl_212 {
    public static  double convertC(String[][] money,String[][] convertionRate)
    {
        double sum=0;
        for(int x=0; x<money.length; x++){
            sum+=(Double.parseDouble(money[x][1])) * (Double.parseDouble(convertionRate[x][1]));

        }
        return sum;
    }
    public static void main(String[] args)
    {

        String[][] test_money =
                {
                        {"mark","5"},
                        {"shekel","30.5"},
                };

        String[][] test_convert=
                {
                        {"mark","1"},
                        {"shekel","0.5"},
                };

        double res = convertC(test_money,test_convert);
        System.out.print(res);

    }


}
