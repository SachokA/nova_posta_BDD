package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageStepDefinitions {
    MainPage mainPage = new MainPage();

    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        mainPage.openMainPage();
    }

    @When("I click on Вартість доставки")
    public void iClickOnTheDeliveryPrice() {
        mainPage.clickOnTheDeliveryPriceMenuItem();
    }
}
