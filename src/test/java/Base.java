import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
    public WebDriver webDriver;

    @BeforeMethod
    public void basePage(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.get("https://the-internet.herokuapp.com/");
        webDriver.manage().window().maximize();


    }


    @AfterMethod
    public void tearDown() {
        if (webDriver != null)
           webDriver.quit();

    }
}
