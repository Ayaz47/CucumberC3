package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NewCostumerPage extends BasePage {
    @FindBy(css = "input[name='name']")
    private WebElement name;
    @FindBy(id = "dob")
    private WebElement dob;
    @FindBy(css = "textarea[name='addr']")
    private WebElement address;
    @FindBy(css = "input[name='city']")
    private WebElement city;
    @FindBy(css = "input[name='state']")
    private WebElement state;
    @FindBy(css = "input[name='pinno']")
    private WebElement pinno;
    @FindBy(css = "input[name='telephoneno']")
    private WebElement phoneNumber;
    @FindBy(css = "input[name='emailid']")
    private WebElement email;
    @FindBy(css = "input[name='password']")
    private WebElement password;
    @FindBy(css = "input[value='Submit']")
    private WebElement submit;
    @FindBy(xpath = "//p[contains(text(),'Customer Registered Successfully!!!')]")
    private WebElement success;
    public void NewCostumerPagefilling (){
        name.sendKeys("ikbal");
        dob.sendKeys("1996"+ Keys.TAB+ "0813");
        address.sendKeys("10128 Keele Street");
        city.sendKeys("toronto");
        state.sendKeys("Ontario");
        pinno.sendKeys("231424");
        phoneNumber.sendKeys("6477453904");
        email.sendKeys("ikbalaya232@gmail.com");
        password.sendKeys("23141312312");
        submit.click();



    }
    public void VerifyNewCostumer(){
        Assert.assertTrue(success.isDisplayed());
    }

}
