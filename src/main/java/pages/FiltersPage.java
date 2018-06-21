package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FiltersPage {

    public FiltersPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    @FindBy(css = "#glf-pricefrom-var")
    //@FindBy(xpath = "//*[@name='glf-pricefrom-var']']")
    WebElement priceFromField;

    @FindBy(xpath = "//*[@name='glf-priceto-var']")
    WebElement priceToField;

    @FindBy(xpath = "//*[@for='glf-7893318-8455647']")
    WebElement beatsCheckBox;

    @FindBy(xpath = "//*[@for='glf-7893318-153074']")
    WebElement lgCheckBox;

    @FindBy(xpath = "//*[@for='glf-7893318-153061']")
    WebElement samsungCheckBox;

    @FindBy(xpath = "//*[@class='button button_size_l button_theme_pseudo i-bem button_action_show-filtered n-filter-panel-extend__controll-button_size_big button_js_inited']")
    WebElement applyFilter;

    public void setBeatsCheckBox(){
        beatsCheckBox.click();
    }
    public void setLgCheckBox(){
        lgCheckBox.click();
    }
    public void setSamsungCheckBox(){
        samsungCheckBox.click();
    }


    protected void fillField(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }

    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "от":
                priceFromField.click();
                fillField(priceFromField, value);
                break;
            case "до":
                priceFromField.click();
                fillField(priceToField, value);
                break;
        }
    }

    public void applyFilter() throws InterruptedException {
        Thread.sleep(3000);
        applyFilter.click();
    }
}
