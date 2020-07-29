package org.example;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Util{
    BrowserManager browserManager=new BrowserManager();
    @BeforeMethod
    public void OpenBrowser(){
        browserManager.setUpWebBrowser();
        //browserManage.setUpWebBrowser1();
    }
    @AfterMethod
    public void CloseBrowser(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus())
        {
            takeScreenShot(result.getName()+timeStamp());
        }
        browserManager.closeBrowser();
    }
}
