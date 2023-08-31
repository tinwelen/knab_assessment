package tinwel.UI.helpers;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://trello.com/templates")
public class TemplatesPage {
    public static By templates_container = By.cssSelector("[data-testid='templates-container']");
    public static By board_name_from_template_input = By.cssSelector("#boardNewTitle");
    public static By use_template_button = By.cssSelector(".R1FmqNQGU60Wlf");
    public static By template_pop_up_header = By.cssSelector(".pop-over-header-title");
    public static By submit_board_from_template_button = By.cssSelector(".js-submit");
}
