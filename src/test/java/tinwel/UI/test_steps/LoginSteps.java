package tinwel.UI.test_steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import tinwel.UI.helpers.LoginPage;

import java.time.Duration;

public class LoginSteps extends UIInteractionSteps {
    public String defaultEmail = "tinwel@qa.team";
    public String defaultPassword = "KnabAssessment6";

    @Step("Enter email {0}")
    public void enterEmail(String email) {
        $(LoginPage.email_input).sendKeys(email);
    }

    @Step("Click continue login button")
    public void clickContinue() {
        $(LoginPage.continue_button).click();
    }

    @Step("Enter password {0}")
    public void enterPassword(String password) {
        withTimeoutOf(Duration.ofSeconds(10)).find(LoginPage.password_input).sendKeys(password);
    }

    @Step("Click submit login button")
    public void clickLogin() {
        $(LoginPage.submit_button).click();
    }
}
