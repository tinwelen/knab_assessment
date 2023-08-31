package tinwel.UI.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import tinwel.UI.helpers.BoardPage;
import tinwel.UI.helpers.NavigationHelper;
import tinwel.UI.test_steps.DashboardSteps;
import tinwel.UI.test_steps.LoginSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepDefinitions {

    @Steps
    NavigationHelper navigateTo;

    @Steps
    LoginSteps login;

    @Steps
    DashboardSteps dashboard;

    @Given("Someone is logged in")
    public void someone_is_logged_in() {
        navigateTo.loginPage();
        login.enterEmail(login.defaultEmail);
        login.clickContinue();
        login.enterPassword(login.defaultPassword);
        login.clickLogin();
        assertThat(dashboard.boardByNameIsDisplayed(BoardPage.defaultBoardName)).isTrue();
    }

    @When("Someone opens login page")
    public void open_login_page() {
        navigateTo.loginPage();
    }

    @And("They enter their email")
    public void theyEnterTheirEmail() {
        login.enterEmail(login.defaultEmail);
    }

    @And("They click continue")
    public void theyClickContinue() {
        login.clickContinue();
    }

    @And("They enter their password")
    public void theyEnterTheirPassword() {
        login.enterPassword(login.defaultPassword);
    }

    @And("They click login")
    public void theyClickLogin() {
        login.clickLogin();
    }

    @Then("They see dashboard page")
    public void theySeeDashboardPage() {
        assertThat(dashboard.boardByNameIsDisplayed(BoardPage.defaultBoardName)).isTrue();
        assertThat(dashboard.sideMenuIsShown()).isTrue();
    }
}

