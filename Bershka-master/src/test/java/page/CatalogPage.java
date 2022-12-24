package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;



public class CatalogPage extends AbstractPage{

    public final By cakesLocator = By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[3]/ul/li[5]/a");
   static final By bruscetLocator = By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[7]/ul/li[4]/a");

    public CatalogPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public CakesPage cakesCatalogClick(){
        WebElement cakesButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(cakesLocator));
        cakesButton.click();
        logger.info("cakes click");
        return new CakesPage(driver);
    }

    public BruscetPage brusketsList(){
        WebElement cakesButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(bruscetLocator));
        cakesButton.click();
        logger.info("bruscet click");
        return new BruscetPage(driver);



    }


}
