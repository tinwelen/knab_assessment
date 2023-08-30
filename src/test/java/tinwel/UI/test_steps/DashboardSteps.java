package tinwel.UI.test_steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import tinwel.UI.helpers.DashboardPage;

import java.time.Duration;

public class DashboardSteps extends UIInteractionSteps {

    @Step("Check if default board tile is shown")
    public boolean defaultBoardIsDisplayed() {
        return withTimeoutOf(Duration.ofSeconds(10)).find(DashboardPage.default_board_tile).isDisplayed();
    }

    @Step("Click default board tile")
    public void clickDefaultBoard() {
        $(DashboardPage.default_board_tile).click();
    }
}
