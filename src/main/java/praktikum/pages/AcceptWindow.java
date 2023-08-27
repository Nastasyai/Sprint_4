package praktikum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AcceptWindow {
    final WebDriver driver;
    public AcceptWindow(WebDriver driver) {
        this.driver = driver;
    }
    public AcceptWindow clickWindow() {
        driver.findElement(By.className("Order_Modal__YZ-d3"));
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
        return this;

    }
}
