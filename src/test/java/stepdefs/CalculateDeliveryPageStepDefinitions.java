package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import pages.CalculateDeliveryPage;

public class CalculateDeliveryPageStepDefinitions {
    CalculateDeliveryPage calculateDeliveryPage = new CalculateDeliveryPage();

    @Then("I redirected to page with title Вартість доставки")
    public void iRedirectedToPageWithTitle() {
        Assertions.assertThat(calculateDeliveryPage.getPageTitle())
                .as("Page title is not as expected")
                .isEqualTo("Вартість доставки");
    }

    @When("I select Місто-відправник as {string}")
    public void iSelectCitySent(String string) {
        calculateDeliveryPage.selectSenderCity(string);
    }

    @When("I select Місто-одержувач as {string}")
    public void iSelectCityDelivery(String string) {
        calculateDeliveryPage.selectDeliveryCity(string);
    }
    @When("I click on Розрахувати вартість button")
    public void iClickOnCalculateTheCostButton() {
        calculateDeliveryPage.clickButtonCalculateTheCost();
    }

    @Then("Input field Оголошена вартість highlighted in red")
    public void inputFieldAnnouncedPriceHighLightedInRed() {
        Assertions.assertThat(calculateDeliveryPage
                        .isInputHighlightedRedAnnouncedPrice())
                .as("Not colour red").isEqualTo("rgb(243, 95, 87)");
    }
    @Then("Input field Вага highlighted in red")
    public void inputFieldWeightHighLightedInRed() {
        Assertions.assertThat(calculateDeliveryPage
                        .isInputHighlightedWeight())
                .as("Not colour red").isEqualTo("rgb(243, 95, 87)");
    }
    @Then("Input field Довжина highlighted in red")
    public void inputFieldLenghtHighLightedInRed() {
        Assertions.assertThat(calculateDeliveryPage
                        .isInputHighlightedLength())
                .as("Not colour red").isEqualTo("rgb(243, 95, 87)");
    }
    @Then("Input field Ширина highlighted in red")
    public void inputFieldWidthHighLightedInRed() {
        Assertions.assertThat(calculateDeliveryPage
                        .isInputWidthLightedLength())
                .as("Not colour red").isEqualTo("rgb(243, 95, 87)");
    }
    @Then("Input field Висота highlighted in red")
    public void inputFieldHeightHighLightedInRed() {
        Assertions.assertThat(calculateDeliveryPage
                        .isInputHeightLightedLength())
                .as("Not colour red").isEqualTo("rgb(243, 95, 87)");
    }




}
