package tinwel.UI.helpers;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://trello.com/u/tinwel/boards")
public class DashboardPage {
    public static By templates_market_menu_button = By.cssSelector("[data-testid='templates']");
}
