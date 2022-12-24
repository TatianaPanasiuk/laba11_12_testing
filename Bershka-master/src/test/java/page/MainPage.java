package page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;


public class MainPage extends AbstractPage{

    private final String HOMEPAGE_URL = "https://wolkonsky.com/";
    private final By cityLocator = By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[1]/a[1]");
    private final By acceptButtonLocator = By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[2]/a");
    private  final By menuLocator = By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/a");


    public final By adressLocator = By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div[3]/a");

    public MainPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver,this);
    }


    public MainPage openPage(){
        driver.get(HOMEPAGE_URL);
       driver.manage().window().maximize();
        return this;
    }


    public MainPage cityClick() {
        WebElement city = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(cityLocator));
        city.click();
        logger.info("City click");
        return this;
    }

    public MainPage acceptCity() {
        WebElement acceptButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(acceptButtonLocator));
        acceptButton.click();
        logger.info("City accept");
        return this;
    }

    public CatalogPage menuClick() {
        CustomDelay(3);
        WebElement menuButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(menuLocator));
        menuButton.click();

        logger.info("Menu click");
        return new CatalogPage(driver);

    }

    public AdressPage adressClick() {
        CustomDelay(3);
        WebElement adressButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(adressLocator));
        adressButton.click();

        logger.info("Menu click");
        return new AdressPage(driver);

    }


}
