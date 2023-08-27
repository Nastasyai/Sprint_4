package praktikum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageTwo {     //Заполнение формы второй страницы
    public final By calendar = By.xpath(".//input[@placeholder='* Когда привезти самокат']"); //дата
    public final By timeOrder = By.xpath(".//div[@class='Dropdown-placeholder']"); //срок аренды
    public final By colour = By.xpath(".//div[@class='Order_Checkboxes__3lWSI' and label()='grey']"); //цвет
    public final By order = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM]"); //кнопка заказать
    final WebDriver driver;
    public OrderPageTwo(WebDriver driver) {

        this.driver = driver;
    }

    public OrderPageTwo clickCalendar() { //выбор даты в календаре
        driver.findElement(calendar).click(); //клик по календарю
        driver.findElement(By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN react-datepicker-ignore-onclickoutside' and @placeholder='* Когда привезти самокат']")).sendKeys("31.08.2023"); //указание определенной даты
        return this;
        }
    public OrderPageTwo fillTimeOrder() { //выбор срока аренды
        driver.findElement(timeOrder).click();
        driver.findElement(By.xpath(".//div[@class='Dropdown-option' and text()='двое суток']")).click();
        return this;
    }
    public OrderPageTwo selectColour() { //выбор цвета
        driver.findElement(colour).click();
        return this;
    }
    public OrderPageTwo clickOrder() {     //Клик по кнопке Заказать
        driver.findElement(order).click();
        return this;
    }
}
