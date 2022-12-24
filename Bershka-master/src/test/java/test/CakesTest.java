package test;

import page.*;
import org.testng.annotations.Test;

public class CakesTest extends CommonConditions {

    @Test(description = "Добавить пирог в Довиль вкорзину")
    public void CakesTest1() {
        new MainPage(driver).openPage()
                .cityClick()
                .acceptCity()
                .menuClick()
                .cakesCatalogClick()
                .cakeClick()
                .addToBasket();
    }

    @Test(description = "поиск пекарен и кафе на карте по станции метро")
    public void CakesTest2(){
        new MainPage(driver).openPage()
                .cityClick()
                .acceptCity()
                .adressClick()
                .clickToMetro()
                ;
    }


    @Test(description = "посмотреть брускеты")
    public void CakesTest3(){
        new MainPage(driver).openPage()
                .cityClick()
                .acceptCity()
                .menuClick()
                .brusketsList();
    }

    @Test(description = "Добавить товар в корзину и удалить из корзины")
    public void CakesTest4() {
        new MainPage(driver).openPage()
                .cityClick()
                .acceptCity()
                .menuClick()
                .cakesCatalogClick()
                .cakeClick()
                .addToBasket()
                .deleteFromBasket();
    }

    @Test(description = "Оформить заказ указав неверный номер")
    public void CakesTest5() {
        new MainPage(driver).openPage()
                .cityClick()
                .acceptCity()
                .menuClick()
                .cakesCatalogClick()
                .cakeClick()
                .addToBasket().clickToOrder()
                .numberEnter("+7 (890) 987-65-43")
                .clickNextStep();

    }

    @Test(description = "поиск пекарен и кафе на карте по станции метро spiscom")
    public void CakesTest6(){
        new MainPage(driver).openPage()
                .cityClick()
                .acceptCity()
                .adressClick()
                .clickToMetro()
                .clickSpisok()
        ;
    }


}
