package steps;

import cucumber.api.java.en.When;

public class ScenarioSteps {

    FiltersSteps filtersSteps = new FiltersSteps();
    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();

    @When("^выбран Маркет$")
    public void selectMarket(){mainSteps.selectMarket();}


    @When("^курсор наведен на пункт меню \"(.*)\"$")
    public void moveToMainMenu(String menuItem) {
        marketSteps.moveToMainMenu(menuItem);
    }

    @When("^выбран подпункт - \"(.*)\"$")
    public void selectSubMenu(String menuItem){
        marketSteps.selectSubMenu(menuItem);
    }

    @When("^нажата кнопка - Перейти ко всем фильтрам$")
    public void selectGoToFilters(){
        marketSteps.selectGoToFilters();
    }

    @When("^нажата кнопка - Найти$")
    public void selectSubmitSearch(){
        marketSteps.selectSubmitSearch();
    }


    @When("^отмечен чекбокс Beats$")
    public void setBeatsCheckBox(){
        filtersSteps.setBeatsCheckBox();
    }
    @When("^отмечен чекбокс LG$")
    public void setLgCheckBox(){
        filtersSteps.setLgCheckBox();
    }
    @When("^отмечен чекбокс Samsung")
    public void setSamsungCheckBox(){
        filtersSteps.setSamsungCheckBox();
    }


    @When("заполняется поле \"(.*)\" с ценой \"(.*)\"$")
    public void fillField(String fieldName, String value){
        filtersSteps.fillField(fieldName,value);
    }

    @When("^нажата кнопка - Применить фильтр")
    public void applyFilter() throws InterruptedException {
        filtersSteps.applyFilter();
    }

    @When("^в всплывающем окне Ваш регион нажата кнопка - Да, всё верно")
    public void regionDefenitionYesButton(){
        marketSteps.regionDefenitionYesButton();
    }


    @When("^предполагаемое количество элементов - (\\d+)$")
    public void compareCountOfElements(int countToCompare){
            marketSteps.compareCountOfElements(countToCompare);
    }

    @When("^поиск первого из элементов - Сценарий №1$")
    public void firstElementSearchS1(){
        marketSteps.firstElementSearchS1();
    }

    @When("^поиск первого из элементов - Сценарий №2$")
    public void firstElementSearchS2(){
        marketSteps.firstElementSearchS2();
    }


    @When("^в строку поиска введен title первого элемента$")
    public void fillSearchField(){
        marketSteps.fillSearchField();
    }

    @When("^проверка элемента после поиска - Сценарий №1$")
    public void afterSearchCompareS1(){
        marketSteps.afterSearchCompareS1();
    }

    @When("^проверка элемента после поиска - Сценарий №2$")
    public void afterSearchCompareS2(){
        marketSteps.afterSearchCompareS2();
    }
}
