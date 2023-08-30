package praktikum;

import org.hamcrest.MatcherAssert;
import org.junit.Rule;
import org.junit.Test;
import praktikum.pages.MainPage;
import praktikum.pages.OrderPage;
import praktikum.pages.OrderPageTwo;
import praktikum.pages.PopupWindow;


public class OrderPageTest {
    @Rule
    public DriverRule driverRule = new DriverRule();

    @Test
    public void orderWithFirstButton() { //заказ через верхнюю кнопку
        MainPage mainPage = new MainPage(driverRule.getDriver());
        mainPage.open();            //открываем главную
        mainPage.closeCookie();     //закрываем куки
        mainPage.clickOrderUp();    //клик по верхней кнопке заказа

        OrderPage orderPage = new OrderPage(driverRule.getDriver());
        orderPage.fillOrderFirst(); //заполнение формы первой страницы
        orderPage.clickNext();      //клик далее

        OrderPageTwo orderPageTwo = new OrderPageTwo(driverRule.getDriver());
        orderPageTwo.fillTimeOrder();    //выбор срока аренды
        orderPageTwo.clickCalendar();    //выбор даты в календаре
        orderPageTwo.selectColour();     //выбор цвета
        orderPageTwo.clickOrder();       //клик на заказать

        PopupWindow acceptWindow = new PopupWindow(driverRule.getDriver());
        acceptWindow.clickFirstWindow(); //клик Да в попапе
        acceptWindow.clickSecondWindow(); //клик во втором попапе
        acceptWindow.showTrackForm(); //страница со статусом заказа
        acceptWindow.findCancelButton(); //страница формы заказа

        MatcherAssert.assertThat(acceptWindow.findCancelButton(), true);  // проверка кнопки Отменить заказ
}

    @Test
    public void orderWithSecondButton() { //заказ через нижнюю кнопку
        MainPage mainPage = new MainPage(driverRule.getDriver());
        mainPage.open();            //открываем главную
        mainPage.closeCookie();     //закрываем куки
        mainPage.scrollOrderDown(); //скролл до нижней кнопки
        mainPage.clickOrderDown();    //клик по нижней кнопке заказа

        OrderPage orderPage = new OrderPage(driverRule.getDriver());
        orderPage.fillOrderFirst(); //заполнение формы первой страницы
        orderPage.clickNext();      //клик далее

        OrderPageTwo orderPageTwo = new OrderPageTwo(driverRule.getDriver());
        orderPageTwo.fillTimeOrder();    //выбор срока аренды
        orderPageTwo.clickCalendar();    //выбор даты в календаре
        orderPageTwo.selectColour();     //выбор цвета
        orderPageTwo.clickOrder();       //клик на заказать

        PopupWindow acceptWindow = new PopupWindow(driverRule.getDriver());
        acceptWindow.clickFirstWindow(); //клик Да в попапе
        acceptWindow.clickSecondWindow(); //клик во втором попапе
        acceptWindow.showTrackForm(); //страница со статусом заказа
        acceptWindow.findCancelButton(); //страница формы заказа

        MatcherAssert.assertThat(acceptWindow.findCancelButton(), true);  // проверка кнопки Отменить заказ
    }
}