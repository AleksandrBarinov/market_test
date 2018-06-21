package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps{

    @Step("выбран Маркет")
    public void selectMarket(){
        new MainPage(BaseSteps.driver).selectMarket();

    }
}