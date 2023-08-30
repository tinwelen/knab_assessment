package tinwel.UI.helpers;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://trello.com/b/yI8ILdZL/my-trello-board")
public class BoardPage {
    public static By board_name_input_container = By.cssSelector("[data-testid='board-name-container']");

    public static By board_name_input = By.cssSelector("[data-testid='board-name-input']");

    public static By board_name_text = By.cssSelector("[data-testid='board-name-display']");
    // <h1 data-testid="board-name-display">Board Name</h1>
}
