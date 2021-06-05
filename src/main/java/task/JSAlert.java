package task;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.JSAlertUI;

public class JSAlert {

    public static void as(WebDriver webdriver) {
        Click.on(webdriver, JSAlertUI.jsAlert);
    }
    public static void es(WebDriver webdriver) {
        Click.on(webdriver, JSAlertUI.jsConfirm);
    }
    public static void is(WebDriver webdriver) {
        Click.on(webdriver, JSAlertUI.jsPrompt);
    }
}
