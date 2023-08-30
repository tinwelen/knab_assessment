package tinwel.UI.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import tinwel.UI.test_steps.DashboardSteps;
import tinwel.UI.test_steps.BoardSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class DashboardStepDefinitions {
    @Steps
    DashboardSteps dashboard;

    @Steps
    BoardSteps board;

    @When("They click default board tile")
    public void click_board_tile() {
        dashboard.clickDefaultBoard();
    }

    @Then("They see default board screen")
    public void board_screen_is_open() {
        board.defaultBoardPageIsDisplayed();
    }
}
