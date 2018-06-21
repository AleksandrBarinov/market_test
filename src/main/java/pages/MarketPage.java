package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;
import steps.BaseSteps;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class MarketPage {

    public MarketPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public String getTepmElementTitle() {
        return tepmElementTitle;
    }

    public void setTepmElementTitle(String tepmElementTitle) {
        this.tepmElementTitle = tepmElementTitle;
    }

    public String tepmElementTitle;

    @FindBy(xpath = "//*[@class='topmenu__list']")
    WebElement subMenu;

    @FindBy(xpath = "//*[text()='Перейти ко всем фильтрам']")
    WebElement goToFilters;

    @FindBy(css = "#header-search")
    WebElement searchField;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement submitSearch;

    @FindBy(xpath = "//*[@class='button2 button2_size_m button2_theme_action button2_width_max n-region-notification__actions-btn n-region-notification__ok']")
    WebElement regionDefenitionYesButton;



    public void moveToSubMenu(String menuItem){

        Actions builder = new Actions(BaseSteps.driver);
        builder.moveToElement(subMenu.findElement(By.xpath(".//*[text()='"+menuItem+"']/parent::li"))).build().perform();
    }

    public void selectSubMenu(String menuItem){
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.driver, 15, 1000);
        wait.until(ExpectedConditions.visibilityOf(subMenu.findElement(By.xpath(".//*[text()='"+menuItem+"']")))).click();

    }

    public void selectGoToFilters(){
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.driver, 15, 1000);
        wait.until(ExpectedConditions.visibilityOf(goToFilters)).click();

    }

    public void fillSearchField(){
        searchField.clear();
        searchField.sendKeys(getTepmElementTitle());

    }

    public void selectSubmitSearch(){
        submitSearch.click();

    }

    public void regionDefenitionYesButton(){
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.driver, 15, 1000);
        wait.until(ExpectedConditions.visibilityOf(regionDefenitionYesButton)).click();
    }

    public void compareCountOfElements(int countToCompare){
        int compEl = BaseSteps.driver.findElements(By.xpath("//*[contains(@data-id,'model')]")).size();
        assertEquals(countToCompare,compEl);
    }

    public void firstElementSearchS1(){
        List<WebElement> elements = BaseSteps.driver.findElements(By.xpath("//*[@class='n-snippet-card2__title']/a"));
        setTepmElementTitle(elements.get(0).getAttribute("title"));

    }

    public void firstElementSearchS2(){
        List<WebElement> elements = BaseSteps.driver.findElements(By.xpath("//*[@class='image']/../*[contains(@title,'Наушники')]"));
        setTepmElementTitle(elements.get(0).getAttribute("title"));

    }

    public void afterSearchCompareS1(){

        String findResult = BaseSteps.driver.findElement(By.xpath("//*[@class='title title_size_28 title_bold_yes']")).getText();;
        assertEquals(getTepmElementTitle(), findResult);

    }

    public void afterSearchCompareS2(){
        String title = getTepmElementTitle();

        List<WebElement> findResults = BaseSteps.driver.findElements(By.xpath("//*[@class='image']/../*[contains(@title,'"+title+"')]"));
        String findResult = findResults.get(0).getAttribute("title");
        assertEquals(getTepmElementTitle(), findResult);

    }




}
