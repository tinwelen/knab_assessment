package tinwel.UI.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import tinwel.UI.test_steps.DashboardSteps;
import tinwel.UI.test_steps.TemplatesSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class TemplatesStepDefinitions {
    @Steps
    TemplatesSteps templates;

    @Steps
    DashboardSteps dashboard;

    @When("They click Templates side menu option")
    public void click_header_option_by_name() {
        dashboard.clickSideMenuTemplatesOption();
        assertThat(templates.templatesAreShown()).isTrue();
    }

    @And("They select {string} as a template")
    public void select_template_by_name(String templateName) {
        templates.clickTemplateByName(templateName);
        assertThat(templates.templateHeaderByNameIsShown()).isTrue();
    }

    @And("They click Use template button")
    public void use_template() {
        templates.useTemplate();
        assertThat(templates.templatePopupIsShown()).isTrue();
    }

    @And("They enter {string} as board name")
    public void enter_board_name(String name) {
        templates.enterBoardName(name);
    }

    @Then("They click submit board from header template button")
    public void submit_board_from_header_template_button() {
        templates.submitBoardFromTemplate();
    }
}
