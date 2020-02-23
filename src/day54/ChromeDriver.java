package day54;

public class ChromeDriver implements WebDriver{
    @Override
    public void openBrpwser() {
        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to "+url+" using Chrome Browser");
    }

    @Override
    public void maximize() {
        System.out.println("Maximazing Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome Browser");

    }
}
