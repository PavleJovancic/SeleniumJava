package TAF.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MainPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(name="q")
    WebElement searchInput;

    @FindBy(name="btnK")
    WebElement confirmButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
    }

    public ResultPage typeTermInSearchboxAndConfirm(String searchTerm){
        searchInput.sendKeys(searchTerm);
        confirmButton.click();

        return new ResultPage(driver);
    }

}
