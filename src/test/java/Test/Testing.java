package Test;

import BasesPackage.BaseClass;
import Utilities.BrowserUtilities;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import pages.HomePage;
import pages.LoginPage;
import pages.NewCostumerPage;

public class Testing extends BaseClass {

    LoginPage loginPage;
    HomePage homePage;
    NewCostumerPage newCostumerPage;


    @Test
   public void verifyTitle(){

    WebElement Title = BrowserUtilities.getDriver().findElement(By.xpath("//h2[.='Guru99 Bank']"));
    Assert.assertTrue(Title.isDisplayed());
       BrowserUtilities.getDriver().findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr391787");
       BrowserUtilities.getDriver().findElement(By.name("password")).sendKeys("EpYtenE");
       BrowserUtilities.getDriver().findElement(By.name("btnLogin")).click();
   }


    @Test(dataProvider ="test-data")
    public void LoginCred(String enterusername, String enterpassword){


     WebElement userid   =   BrowserUtilities.getDriver().findElement(By.xpath("//input[@name='uid']"));
     WebElement passport =   BrowserUtilities.getDriver().findElement(By.name("password"));
     WebElement Loginbox =   BrowserUtilities.getDriver().findElement(By.name("btnLogin"));
       userid.sendKeys(enterusername);
        passport.sendKeys(enterpassword);
        Loginbox.click();
        Alert alert =BrowserUtilities.getDriver().switchTo().alert();
        alert.accept();


    }

    @DataProvider(name ="test-data")
    public Object[][] dataprov(){
     return new Object[][]{
             {"Hello123","1234567"},
             {"Hello1234","987654321"},
             {"Hello1235","123456"},
             {"mngr3912787","EpYtenE"},
     };
    }
   @Test
 public void HomepageVerification(){
       loginPage = new LoginPage();
       loginPage.LogIn();
        WebElement Manger = BrowserUtilities.getDriver().findElement(By.xpath("//td[.='Manger Id : mngr391787']"));
     Assert.assertTrue(Manger.isDisplayed());

   }
   @Test
    public void addNewCostumer(){
       loginPage = new LoginPage();
       homePage = new HomePage();
       newCostumerPage = new NewCostumerPage();
       loginPage.LogIn();
       homePage.NewCostumer.click();
       newCostumerPage.NewCostumerPagefilling();
       newCostumerPage.VerifyNewCostumer();



   }

 }

