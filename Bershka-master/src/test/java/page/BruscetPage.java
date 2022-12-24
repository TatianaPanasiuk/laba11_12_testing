package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;


public class BruscetPage extends AbstractPage {


    public BruscetPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver,this);
    }


}
