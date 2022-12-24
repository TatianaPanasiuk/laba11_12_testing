package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CakesPage extends AbstractPage {
    public final By cakeLocator = By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[3]/div[4]/a/div[1]/div/img");
    public CakesPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public CakePage cakeClick(){
        WebElement cakeButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(cakeLocator));
        cakeButton.click();
        logger.info("Click to cake page");
        return new CakePage(driver);

    }

}
