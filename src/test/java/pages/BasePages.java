package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePages {

    public BasePages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
