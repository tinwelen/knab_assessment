package tinwel.UI.helpers;

import net.thucydides.core.annotations.Step;

public class NavigationHelper {
    LoginPage loginPage;

    @Step("Open login page")
    public void loginPage() {
        loginPage.open();
    }
}