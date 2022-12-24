package page;

import org.apache.logging.log4j.core.config.Order;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class AdressPage extends AbstractPage{

public final By spinnerMetro = By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div/div[2]/div/div/div/div/div/span/span[1]/span/span[2]");
public final By stationMetro = By.xpath("/html/body/span/span/span[2]/ul/li[2]/span");
public final By spisok = By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div/div[1]/div");
public AdressPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public AdressPage clickToMetro(){
        WebElement menuButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(spinnerMetro));
        menuButton.click();

        WebElement stationButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(stationMetro));
        stationButton.click();
        return this;
    }

    public AdressPage clickSpisok(){
        WebElement menuButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(spisok));
        menuButton.click();
        return this;
    }


}
