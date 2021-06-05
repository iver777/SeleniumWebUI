import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts extends Base{


    @Test
    public void testAlerts(){
        String texto;
        WebElement link=webDriver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        link.click();


        WebElement jsAlert=webDriver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();
        Alert alert=webDriver.switchTo().alert();
        texto=alert.getText();
        Assert.assertEquals(texto, "I am a JS Alert");
        alert.accept();

        WebElement jsConfirm=webDriver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirm.click();
        Alert alert1=webDriver.switchTo().alert();
        texto=alert1.getText();
        Assert.assertEquals(texto, "I am a JS Confirm");
        alert1.accept();

        WebElement jsPromp=webDriver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPromp.click();
        Alert alert2=webDriver.switchTo().alert();
        alert2.sendKeys("hola mundo");
        alert2.accept();
        WebElement result=webDriver.findElement(By.id("result"));
        texto=result.getText();
        Assert.assertEquals(texto, "You entered: hola mundo");





    }


}
