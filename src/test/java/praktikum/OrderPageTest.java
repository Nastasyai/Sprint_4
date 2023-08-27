package praktikum;

import org.junit.Rule;
import org.junit.Test;
import praktikum.pages.AcceptWindow;
import praktikum.pages.MainPage;
import praktikum.pages.OrderPage;
import praktikum.pages.OrderPageTwo;


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
        orderPageTwo.clickCalendar();    //выбор даты в календаре
        orderPageTwo.fillTimeOrder();    //клик заказать
        orderPageTwo.selectColour();     //выбор цвета
        orderPageTwo.clickOrder();       //клик на заказать

        AcceptWindow acceptWindow = new AcceptWindow(driverRule.getDriver());
        acceptWindow.clickWindow(); //подтверждение заказа
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
        orderPageTwo.clickCalendar();    //выбор даты в календаре
        orderPageTwo.fillTimeOrder();    //клик заказать
        orderPageTwo.selectColour();     //выбор цвета
        orderPageTwo.clickOrder();       //клик на заказать

        AcceptWindow acceptWindow = new AcceptWindow(driverRule.getDriver());
        acceptWindow.clickWindow(); //подтверждение заказа
    }
}