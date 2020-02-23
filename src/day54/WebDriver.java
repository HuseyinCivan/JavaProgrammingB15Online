package day54;
//create 3 implementig classes ChromeDriver , FireFoxDriver, SafariDriver
public interface WebDriver {
    //adding behaviour

    public abstract void  openBrpwser();
    public abstract void navigateTo(String url);
    void maximize();
    void closeBrowser();



}
