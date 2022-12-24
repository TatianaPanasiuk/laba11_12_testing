package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;


public class CakePage extends AbstractPage {

    public CakePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    static final By busketButton = By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/a");

    public BasketPage addToBasket(){

        WebElement addButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(busketButton));
        addButton.click();
        logger.info("Element add to busket");
        return new BasketPage(driver);
    }

//    public BasketPage openBasketPage(){
//        WebElement delButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
//                .until(ExpectedConditions.presenceOfElementLocated(busketButton));
//        delButton.click();
//        logger.info("lalalal");
//        return new BasketPage(driver);
//    }

}
