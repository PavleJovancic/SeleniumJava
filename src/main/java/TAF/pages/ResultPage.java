package TAF.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResultPage {

    WebDriver driver;
    WebDriverWait wait;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("result-stats")));
    }

    @FindBy(id = "result-stats")
    WebElement resultStats;

    @FindBy(id="login")
    WebElement loginButton;

    public String getStatText(){
        wait.until(ExpectedConditions.visibilityOf(resultStats));
        return resultStats.getText();
    }


}
