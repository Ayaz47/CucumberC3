package pages;




import Utilities.BrowserUtilities;
import Utilities.PropertiesReadingUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public  class LoginPage extends BasePage {


    @FindBy(xpath = "//input[@name='uid']")
    public  WebElement userID;

    @FindBy(name = "password")
    public  WebElement password;

    @FindBy(name = "btnLogin")
    public  WebElement loginButton;

 public  void LogIn(){
   userID.sendKeys(PropertiesReadingUtil.getProperties("userID"));
   password.sendKeys(PropertiesReadingUtil.getProperties("password"));
     loginButton.click();


 }
}
