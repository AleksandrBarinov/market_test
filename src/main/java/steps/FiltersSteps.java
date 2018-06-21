package steps;

import pages.FiltersPage;
import ru.yandex.qatools.allure.annotations.Step;

public class FiltersSteps {

    FiltersPage filtersPage = new FiltersPage(BaseSteps.driver);

    @Step("отмечен чекбокс Beats")
    public void setBeatsCheckBox(){
        filtersPage.setBeatsCheckBox();
    }

    @Step("отмечен чекбокс LG")
    public void setLgCheckBox(){
        filtersPage.setLgCheckBox();
    }

    @Step("отмечен чекбокс Samsung")
    public void setSamsungCheckBox(){
        filtersPage.setSamsungCheckBox();
    }

    @Step("заполняется поле {0} с ценой {1}")
    public void fillField(String fieldName, String value){
        filtersPage.fillField(fieldName, value);
    }
    @Step("нажата кнопка - Применить фильтр")
    public void applyFilter() throws InterruptedException {
        FiltersPage filtersSteps = new FiltersPage(BaseSteps.driver);
        filtersSteps.applyFilter();
    }
}