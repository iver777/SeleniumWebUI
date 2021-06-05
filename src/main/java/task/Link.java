package task;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.LinkUI;

public class Link {
    public static void as(WebDriver webdriver) {
        Click.on(webdriver, LinkUI.link1);
    }
    public static void es(WebDriver webdriver) {
        Click.on(webdriver, LinkUI.link2);
    }
    public static void is(WebDriver webdriver) {
        Click.on(webdriver, LinkUI.link3);
    }

}
