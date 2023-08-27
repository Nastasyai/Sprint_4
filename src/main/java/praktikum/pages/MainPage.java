package praktikum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    final WebDriver driver;

    public static final By orderUp = By.xpath(".//button[@class='Button_Button__ra12g']");
    public static final By orderDown = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // Открыть главную
    public MainPage open() {
        driver.get(EnvConfig.BASE_URL);
        return this;
    }

    // Скролл до аккордеона, клик по нему и сравнение с текстом
    public String accordeonClick(int accNumber) {
        WebElement element = driver.findElement(By.className("Home_FourPart__1uthg" + accNumber));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(By.id("accordion__heading-16" + accNumber)).click();
        String text = driver.findElement(By.xpath(".//*[@id='accordion__heading-16']/p")).getText();
        return text;
    }

    //Клик по верхней кнопке Заказать
    public MainPage clickOrderUp() {
        driver.findElement(orderUp).click();
        return this;
    }

    //Скролл до нижней кнопки Заказать
    public MainPage scrollOrderDown() {
        WebElement element = driver.findElement(orderDown);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        return this;
    }

    //Клик по нижней кнопке Заказать
    public MainPage clickOrderDown() {
        driver.findElement(orderDown).click();
        return this;
    }

        //Закрыть куки
        public MainPage closeCookie () {
            driver.findElement(By.id("rcc-confirm-button")).click();
            return this;
        }
    }