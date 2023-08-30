package tinwel.UI.helpers;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://trello.com/u/tinwel/boards")
public class DashboardPage {
    public static By board_tile_by_name = By.xpath("(//div[@title='%s'])[1]");
}
