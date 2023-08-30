package tinwel.API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import net.serenitybdd.core.steps.UIInteractions;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;
import static org.assertj.core.api.Assertions.assertThat;

public class BoardApiStepDefinitions extends UIInteractions {
    String apiKey = "23f5c7fc2df2115404f3db1d2bfef033";
    String token = "ATTAf0a77e5df57cd8a4950376419719da4b8f669e4338e87653e4d84aa84a64c35c43BB3E76";

    String responseCodeSuccess = "200";
    String initialBoardName;
    String postBoardId;
    String postBoardName;
    String getBoardName;

    @Given("POST new board {string}")
    public void add_basic_board(String name) {
        // https://api.trello.com/1/boards/?name={name}&key=APIKey&token=APIToken
        BoardApiObject board = new BoardApiObject(name);
        initialBoardName = name;

        Response postBoardResponse = given()
                .baseUri("https://api.trello.com")
                .basePath("/1")
                .queryParam("key", apiKey)
                .queryParam("token", token)
                .body(board, ObjectMapperType.GSON)
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .post("/boards");

        String responseStatus = postBoardResponse.getStatusLine();

        postBoardName = postBoardResponse.getBody().as(BoardApiObject.class, ObjectMapperType.GSON).getName();
        postBoardId = postBoardResponse.getBody().as(BoardApiObject.class, ObjectMapperType.GSON).getId();

        assertThat(responseStatus.contains(responseCodeSuccess)).isTrue();
    }

    @Then("Board name is sent correctly")
    public void check_card_name() {
        assertThat(postBoardName.equals(initialBoardName)).isTrue();
    }

    @When("GET board")
    public void get_board_by_post_id() {
        // https://api.trello.com/1/boards/{id}
        Response getBoardResponse = when().get("/boards/" + postBoardId);

        String responseStatus = getBoardResponse.getStatusLine();
        getBoardName = getBoardResponse.getBody().as(BoardApiObject.class, ObjectMapperType.GSON).getName();

        assertThat(responseStatus.contains(responseCodeSuccess)).isTrue();
    }

    @Then("New board name is shown correctly")
    public void check_new_board_name() {
        assertThat(getBoardName.equals(initialBoardName)).isTrue();
    }

    @And("DELETE board")
    public void delete_board_by_post_id() {
        // https://api.trello.com/1/boards/{id}
        Response deleteBoardResponse = when().delete("/boards/" + postBoardId);
        String responseStatus = deleteBoardResponse.getStatusLine();

        assertThat(responseStatus.contains(responseCodeSuccess)).isTrue();
    }
}

