package tinwel.UI.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import tinwel.UI.test_steps.BoardSteps;
import tinwel.UI.test_steps.DashboardSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardStepDefinitions {
    @Steps
    BoardSteps board;

    @Steps
    DashboardSteps dashboard;

    String boardName;
    String defaultBoardName = "My Trello board";

    @And("They open {string} board")
    public void open_board_by_name(String name) {
        if (name.equals("default")) {
            boardName = defaultBoardName;
        } else {
            boardName = name;
        }

        dashboard.clickBoardByName(boardName);
    }

    @Then("They see {string} board page")
    public void board_page_is_open(String name) {
        if (name.equals("default")) {
            boardName = defaultBoardName;
        } else {
            boardName = name;
        }

        assertThat(board.checkBoardHeaderIsShown()).isTrue();
        assertThat(board.checkBoardName().equals(boardName)).isTrue();
    }

    /*
    @And("")
    public void generic_method() throws Exception {
        throw new Exception(String.format("Unexpected name %s.", "aaaaaa"));
    }
    */
}
