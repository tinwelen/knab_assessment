package tinwel.UI.test_steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import tinwel.UI.helpers.DashboardPage;

import java.time.Duration;

public class DashboardSteps extends UIInteractionSteps {
    By board_tile_by_name;

    @Step("Check if board tile is shown")
    public boolean boardByNameIsDisplayed(String name) {
        board_tile_by_name = By.xpath(String.format("(//div[@title='%s'])[1]", name));

        return withTimeoutOf(Duration.ofSeconds(10)).find(board_tile_by_name).isDisplayed();
    }

    @Step("Click board tile by name")
    public void clickBoardByName(String name) {
        board_tile_by_name = By.xpath(String.format("(//div[@title='%s'])[1]", name));

        $(board_tile_by_name).click();
    }

    @Step("Check if side menu is shown")
    public boolean sideMenuIsShown() {
        return withTimeoutOf(Duration.ofSeconds(10)).find(DashboardPage.templates_market_menu_button).isDisplayed();
    }

    @Step("Click Templates option in side menu")
    public void clickSideMenuTemplatesOption() {
        withTimeoutOf(Duration.ofSeconds(10)).find(DashboardPage.templates_market_menu_button).click();
    }
}
