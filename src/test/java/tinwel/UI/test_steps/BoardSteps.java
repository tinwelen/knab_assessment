package tinwel.UI.test_steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import tinwel.UI.helpers.BoardPage;

import java.time.Duration;

public class BoardSteps extends UIInteractionSteps {
    @Step("Check if board header is shown")
    public boolean checkBoardHeaderIsShown() {
        return withTimeoutOf(Duration.ofSeconds(10)).find(BoardPage.board_name_input_container).isDisplayed();
    }

    @Step("Check board name")
    public String checkBoardName() {
        return $(BoardPage.board_name_text).getText();
    }
}
