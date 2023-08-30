package tinwel.UI.test_steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import tinwel.UI.helpers.DashboardPage;

import java.time.Duration;

public class DashboardSteps extends UIInteractionSteps {
    @Step("Check if board tile is shown")
    public boolean boardByNameIsDisplayed(String name) {
        // TODO: add String format with board name
        return withTimeoutOf(Duration.ofSeconds(10)).find(DashboardPage.board_tile_by_name).isDisplayed();
    }

    // TODO: add String format with board name
    @Step("Click board tile by name")
    public void clickBoardByName(String name) {
        $(DashboardPage.board_tile_by_name).click();
    }
}
