package tinwel.UI.test_steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import tinwel.UI.helpers.DashboardPage;
import tinwel.UI.helpers.TemplatesPage;

import java.time.Duration;

public class TemplatesSteps extends UIInteractionSteps {
    String templateName;

    @Step("Check if templates page is shown")
    public boolean templatesAreShown() {
        return withTimeoutOf(Duration.ofSeconds(10)).find(TemplatesPage.templates_container).isDisplayed();
    }

    @Step("Click template by name")
    public void clickTemplateByName(String name) {
        templateName = name;
        By selected_template_title = By.xpath(String.format("//div[@title='%s']", templateName));

        $(selected_template_title).click();
    }

    @Step("Check if template header is shown")
    public boolean templateHeaderByNameIsShown() {
        // <h1 class="J10DkvlRVMpQ3w">Kanban Template</h1>
        By selected_template_title = By.xpath(String.format("//h1[text()='%s']", templateName));

        return withTimeoutOf(Duration.ofSeconds(10)).find(selected_template_title).isDisplayed();
    }

    @Step("Click Use template button")
    public void useTemplate() {
        $(TemplatesPage.use_template_button).click();
// TODO: flaky, sometimes is not clicked
    }

    @Step("Check if board from template pop up is shown")
    public boolean templatePopupIsShown() {
        return withTimeoutOf(Duration.ofSeconds(10)).find(TemplatesPage.template_pop_up_header).isDisplayed();
    }

    @Step("Enter board name instead of placeholder")
    public void enterBoardName(String name) {
        $(TemplatesPage.board_name_from_template_input).clear();
        $(TemplatesPage.board_name_from_template_input).sendKeys(name);
    }

    public void submitBoardFromTemplate() {
        $(TemplatesPage.submit_board_from_template_button).click();
    }
}
