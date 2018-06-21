package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketSteps {

    MarketPage marketPage = new MarketPage(BaseSteps.driver);

    @Step("выбран пункт {0}")
    public void moveToMainMenu(String menuItem){
        marketPage.moveToSubMenu(menuItem);
    }

    @Step("выбран подпункт {0}")
    public void selectSubMenu(String menuItem){
        marketPage.selectSubMenu(menuItem);
    }

    @Step("нажата кнопка - Перейти ко всем фильтрам")
    public void selectGoToFilters(){
        marketPage.selectGoToFilters();
    }

    @Step("нажата кнопка - Найти")
    public void selectSubmitSearch(){
        marketPage.selectSubmitSearch();
    }

    @Step("нажата кнопка - Да, всё верно")
    public void regionDefenitionYesButton(){
        marketPage.regionDefenitionYesButton();
    }

    @Step("проверка ожидаемого количества результатов")
    public void compareCountOfElements(int countToCompare){
        marketPage.compareCountOfElements(countToCompare);
    }

    @Step("поиск первого элемента в поисковой строке - Сценарий №1")
    public void firstElementSearchS1(){
        marketPage.firstElementSearchS1();
    }

    @Step("поиск первого элемента в поисковой строке - Сценарий №2")
    public void firstElementSearchS2(){
        marketPage.firstElementSearchS2();
    }

    @Step("в строку поиска введен title первого элемента")
    public void fillSearchField(){
        marketPage.fillSearchField();
        marketPage.selectSubmitSearch();
    }

    @Step("проверка элемента после поиска - Сценарий №1")
    public void afterSearchCompareS1(){
        marketPage.afterSearchCompareS1();
    }

    @Step("проверка элемента после поиска - Сценарий №2")
    public void afterSearchCompareS2(){
        marketPage.afterSearchCompareS2();
    }
}