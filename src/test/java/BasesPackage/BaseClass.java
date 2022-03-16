package BasesPackage;


import Utilities.BrowserUtilities;

import Utilities.PropertiesReadingUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public   class BaseClass  {




    @BeforeMethod
    public void SetUp(){


        BrowserUtilities.getDriver().get(PropertiesReadingUtil.getProperties("url"));
        BrowserUtilities.getDriver().manage().window().maximize();
        BrowserUtilities.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @AfterMethod
    public void closing(){
      BrowserUtilities.sleep(3);
     //   BrowserUtilities.getDriver().close();
    }
}
