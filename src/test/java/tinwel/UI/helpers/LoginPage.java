package tinwel.UI.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://trello.com/login")
public class LoginPage extends PageObject {
    public static By email_input = By.cssSelector("#user");
    public static By continue_button = By.cssSelector("#login");
    public static By password_input = By.cssSelector("#password");
    public static By submit_button = By.cssSelector("#login-submit");
}
