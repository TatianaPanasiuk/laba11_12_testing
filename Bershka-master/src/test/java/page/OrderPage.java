package page;


import org.apache.logging.log4j.core.config.Order;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class OrderPage extends AbstractPage{

    private final By numberSting = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/form/div/div[2]/div[1]/div[3]/div/input");
private final By nextStepOfOrder = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/form/div/div[2]/div[1]/div[3]/div/div[2]");
    public OrderPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public OrderPage numberEnter(String query){
        WebElement searchInput = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(numberSting));
        searchInput.sendKeys(query);
        searchInput.sendKeys(Keys.ENTER);
        return this;
    }

    public OrderPage clickNextStep(){
        WebElement nextButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(nextStepOfOrder));
        nextButton.click();
        return this;
    }

}


