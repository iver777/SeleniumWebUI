import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.JSAlert;
import task.Link;


import static java.lang.Thread.sleep;

public class Alerts extends Base{


    @Test
    public void testAlerts() throws InterruptedException {
        String texto;

        Link.as(webDriver);


        JSAlert.as(webDriver);
        Alert alert=webDriver.switchTo().alert();
        texto=alert.getText();
        sleep(2000);
        Assert.assertEquals(texto, "I am a JS Alert");
        alert.accept();


        JSAlert.es(webDriver);
        sleep(2000);

        texto=alert.getText();
        Assert.assertEquals(texto, "I am a JS Confirm");
        alert.accept();


        JSAlert.is(webDriver);

        alert.sendKeys("hola mundo");
        sleep(2000);
        alert.accept();
        WebElement result=webDriver.findElement(By.id("result"));
        texto=result.getText();
        Assert.assertEquals(texto, "You entered: hola mundo");





    }


}
