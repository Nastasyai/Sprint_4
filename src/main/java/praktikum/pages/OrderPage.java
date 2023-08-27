package praktikum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    final WebDriver driver;
    public static final By name = By.xpath(".//div[@class='Order_Form__17u6u']/div/input[@placeholder='* Имя']"); //имя
    public static final By surname = By.xpath(".//div[@class='Order_Form__17u6u']/div/input[@placeholder='* Фамилия']"); //фамилия
    public static final By adress = By.xpath(".//div[@class='Order_Form__17u6u']/div/input[@placeholder='* Адрес: куда привезти заказ']"); //адрес заказа
    public static final By metro = By.className("select-search__input"); //метро
    public static final By phone = By.xpath(".//div[@class='Order_Form__17u6u']/div/input[@placeholder='* Телефон: на него позвонит курьер']"); //телефон
    public static final By next = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"); //кнопка далее
    public static final By checkMetro = By.xpath(".//div[@class='']/div/div[2]/ul/li[@data-value = '7']"); //выбор станции метро

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    //Заполнение формы первой страницы
    public OrderPage fillOrderFirst() {
        driver.findElement(name).sendKeys("Галина");
        driver.findElement(surname).sendKeys("Петрова");
        driver.findElement(adress).sendKeys("Кутузово");
        driver.findElement(metro).click();
        driver.findElement(checkMetro).click();
        driver.findElement(phone).sendKeys("89111111111");
        return this;
    }

    //Клик по кнопке Далее
    public OrderPage clickNext() {
        driver.findElement(next).click();
        return this;
    }
}
