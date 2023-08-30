package tinwel.UI.test_steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import tinwel.UI.helpers.LoginPage;

import java.time.Duration;

public class LoginSteps extends UIInteractionSteps {
    public String defaultEmail = "tinwel@qa.team";
    public String defaultPassword = "KnabAssessment6";

    @Step("Enter email {0}")
    public void enter_email(String email) {
        $(LoginPage.email_input).sendKeys(email);
    }

    @Step("Click continue login button")
    public void click_continue() {
        $(LoginPage.continue_button).click();
    }

    @Step("Enter password {0}")
    public void enter_password(String password) {
        withTimeoutOf(Duration.ofSeconds(10)).find(LoginPage.password_input).sendKeys(password);
    }

    @Step("Click submit login button")
    public void click_login() {
        $(LoginPage.submit_button).click();
    }
}
