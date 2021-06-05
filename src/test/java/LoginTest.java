import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.Login;

import java.util.concurrent.TimeUnit;

public class LoginTest extends Base {

    @Test
    public  void testLogin(){
        String mensaje;
        WebElement link=webDriver.findElement(By.xpath("//a[@href='/login']"));
        link.click();
        Login.as(webDriver, "tomsmith", "SuperSecretPassword!");
        WebElement texto = webDriver.findElement(By.xpath("//h4[@class='subheader']"));
        //webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mensaje =texto.getText();

        Assert.assertEquals(mensaje, "Welcome to the Secure Area. When you are done click logout below." );
        WebElement salir=webDriver.findElement(By.xpath("//i[@class='icon-2x icon-signout']"));
        salir.click();








    }



}
