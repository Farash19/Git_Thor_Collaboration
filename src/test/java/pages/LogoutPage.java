package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;

public class LogoutPage extends BasePages {
    @FindBy(css = "img[width='32']")
    public WebElement profileIcon;

    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logoutLink;

    public void logout(){
        profileIcon.click();
        BrowserUtils.sleep(2);
        logoutLink.click();
    }
}
