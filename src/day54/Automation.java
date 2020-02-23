package day54;

public class Automation {
    public static void main(String[] args) {

        System.out.println("\n-----RUNNING ON CHROME");
        WebDriver c1=new ChromeDriver();
        c1.openBrpwser();
        c1.navigateTo("wwww.cybertekschool.com");
        c1.maximize();
        c1.closeBrowser();



        System.out.println("\n-----RUNNING ON FIREFOX");
        WebDriver f1=new FireFoxDriver();
        f1.openBrpwser();
        f1.navigateTo("www.google.com");
        f1.maximize();
        f1.closeBrowser();




    }
}
