package pages;

import Utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
    public HomePage(){
        PageFactory.initElements(BrowserUtilities.getDriver(),this);
    }

    @FindBy(xpath ="//a[@href='Managerhomepage.php']")
    public WebElement Manager;
    @FindBy(xpath ="//a[@href='addcustomerpage.php']")
    public WebElement NewCostumer;
    @FindBy(xpath ="//a[@href='EditCustomer.php']")
    public WebElement Editcustumer;
    @FindBy(xpath ="//a[@href='DeleteCustomerInput.php']")
    public WebElement DeleteCostumer;
    @FindBy(xpath ="//a[@href='addAccount.php']")
    public WebElement NewAccount;
    @FindBy(xpath ="//a[@href='editAccount.php']")
    public WebElement EditAccount;
    @FindBy(xpath ="//a[@href='deleteAccountInput.php']")
    public WebElement DeleteAccount;
    @FindBy(xpath ="//a[@href='DepositInput.php']")
    public WebElement Deposit;
    @FindBy(xpath ="//a[@href='WithdrawalInput.php']")
    public WebElement Withdrawal;
    @FindBy(xpath ="//a[@href='FundTransInput.php']")
    public WebElement FundTransfer;
    @FindBy(xpath ="//a[@href='PasswordInput.php']")
    public WebElement ChangePassport;
    @FindBy(xpath ="//a[@href='BalEnqInput.php']")
    public WebElement BalanceEnquiry;
    @FindBy(xpath ="//a[@href='MiniStatementInput.php']")
    public WebElement MiniStatement;
    @FindBy(xpath ="//a[@href='CustomisedStatementInput.php']")
    public WebElement CostumizedStatement;
    @FindBy(xpath ="//a[@href='Logout.php']")
    public WebElement Logout;




}
