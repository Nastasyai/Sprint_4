package praktikum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopupWindow {
    public static final By firstWindow = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text() ='Да']");
    public static final By secondWindow = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Посмотреть статус']");
    public static final By trackForm = By.xpath(".//div[@class='Track_OrderInfo__2fpDL']");
    public static final By cancelButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i' and text()='Отменить заказ']");
    final WebDriver driver;

    public PopupWindow(WebDriver driver) {
        this.driver = driver;
    }

    public PopupWindow clickFirstWindow() {
        driver.findElement(firstWindow).click();
        return this;
    }

    public PopupWindow clickSecondWindow() {
        driver.findElement(secondWindow).click();
        return this;
    }

    public PopupWindow showTrackForm() {
        driver.findElement(trackForm);
        return this;
    }

    public String findCancelButton() {
        return driver.findElement(cancelButton).getText();
    }
}
