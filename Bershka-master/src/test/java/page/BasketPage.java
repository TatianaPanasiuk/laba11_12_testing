package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class BasketPage extends AbstractPage {

    public BasketPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    private final By deleteButton = By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div/div[6]/div");

    private final By orderCake = By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div[4]/a");
    public BasketPage deleteFromBasket(){

        WebElement delButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(deleteButton));
        delButton.click();
        logger.info("Element was Deleted");
        return this;

    }

    public OrderPage clickToOrder(){
        WebElement orderButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(orderCake));
        orderButton.click();
        return new OrderPage(driver);
    }
}






