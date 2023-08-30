package tinwel.UI.helpers;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://trello.com/u/tinwel/boards")
public class DashboardPage {
    public static By default_board_tile = By.xpath("(//div[@title='My Trello board'])[1]");
}
