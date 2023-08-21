package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pages.MainPage.closePopUpButton;

public class CalculateDeliveryPage extends BasePage {

    @FindBy(xpath = "//h1[@class='page_title']")
    private WebElement pageTitleWebElement;

    @FindBy(id = "DeliveryForm_senderCity")
    private WebElement deliverySenderCityCheckBox;
    @FindBy(id = "DeliveryForm_recipientCity")
    private WebElement deliveryRecipientCityCheckBox;

    @FindBy(xpath = "//input[@value='Розрахувати вартість']")
    private WebElement buttonCalculateTheCost;

    @FindBy(xpath = "//input[@name='DeliveryForm[optionsSeat][1][cost]']")
    private WebElement inputAnnouncedPrice;
    @FindBy(xpath = "//input[@name='DeliveryForm[optionsSeat][1][weight]']")
    private WebElement inputWeight;
    @FindBy(xpath = "//input[@name='DeliveryForm[optionsSeat][1][volumetricLength]']")
    private WebElement inputLength;
    @FindBy(xpath = "//input[@name='DeliveryForm[optionsSeat][1][volumetricWidth]']")
    private WebElement inputWidth;
    @FindBy(xpath = "//input[@name='DeliveryForm[optionsSeat][1][volumetricHeight]']")
    private WebElement inputHeight;

    @FindBy(xpath = "//h3[contains(text(),'Разом')]")
    private WebElement fieldTogether;

    public CalculateDeliveryPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public String getPageTitle() {
        return pageTitleWebElement.getText();
    }

    public void selectSenderCity(String city) {
        By senderCityLocator =
                By.xpath("//ul[@id='delivery_sender_cities']//li/span[text()='" + city + "']");
        deliverySenderCityCheckBox.click();
        getDriver().findElement(senderCityLocator).click();
    }

    public void selectDeliveryCity(String city) {
        By senderCityLocator =
                By.xpath("//ul[@id='delivery_recipient_cities']//li/span[text()='" + city + "']");
        deliveryRecipientCityCheckBox.click();
        getDriver().findElement(senderCityLocator).click();
    }

    public void clickButtonCalculateTheCost() {
        buttonCalculateTheCost.click();
        buttonCalculateTheCost.click();
    }

    public String isInputHighlightedRedAnnouncedPrice() {
        return inputAnnouncedPrice.getCssValue("border").substring(12);
    }

    public String isInputHighlightedWeight() {
        return inputWeight.getCssValue("border").substring(12);
    }

    public String isInputHighlightedLength() {
        return inputLength.getCssValue("border").substring(12);
    }

    public String isInputWidthLightedLength() {
        return inputWidth.getCssValue("border").substring(12);
    }

    public String isInputHeightLightedLength() {
        return inputHeight.getCssValue("border").substring(12);
    }

    public void setInputAnnouncedPriceAs(String value) {
        inputAnnouncedPrice.sendKeys(value);
    }

    public void setInputWeight(String value) {
        inputWeight.sendKeys(value);
    }

    public void setInputLength(String value) {
        inputLength.sendKeys(value);
    }

    public void setInputWidth(String value) {
        inputWidth.sendKeys(value);
    }

    public void setInputHeight(String value) {
        inputHeight.sendKeys(value);
    }

    public String getFieldTogether() {
        return fieldTogether.getText().substring(7, 27);
    }

}
