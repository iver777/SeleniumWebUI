import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.Link;
import task.Login;


public class LoginTest extends Base {

    @Test
    public  void testLogin(){
        String mensaje;
        Link.es(webDriver);
        Login.as(webDriver, "tomsmith", "SuperSecretPassword!");
        WebElement texto = webDriver.findElement(By.xpath("//h4[@class='subheader']"));
        mensaje =texto.getText();
        Assert.assertEquals(mensaje, "Welcome to the Secure Area. When you are done click logout below." );
        Link.is(webDriver);








    }



}
