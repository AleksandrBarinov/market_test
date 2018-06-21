package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@class='home-link home-link_blue_yes home-tabs__link home-tabs__search']/..//*[text()='Маркет']")
    WebElement marketLink;

    public void selectMarket() {
        marketLink.click();
    }

}