package tinwel.UI.helpers;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://trello.com/b/yI8ILdZL/my-trello-board")
public class BoardPage {
    public static String defaultBoardName = "My Trello board";
    public static By board_name_input_container = By.cssSelector("[data-testid='board-name-container']");
    public static By board_name_input = By.cssSelector("[data-testid='board-name-input']");
    public static By board_name_text = By.cssSelector("[data-testid='board-name-display']");
}
