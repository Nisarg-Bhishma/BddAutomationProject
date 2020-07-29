package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class HomePage extends Util{
    private String _ExpectedURL="https://demo.nopcommerce.com/";
    String ActualURL=driver.getCurrentUrl();
    LoadProperty loadProperty=new LoadProperty();


    private By _RegisterButton=By.linkText("Register");
    private By _CurrencySelector=By.xpath("//select[@aria-label=\"Currency selector\"]");
    private By _SearchButton= By.xpath("//input[@class='button-1 search-box-button']");
    private By _FBButton=By.xpath("//a[contains(text(),'Facebook')]");
    private By _NewsLatterButton=By.xpath("//div[@class='news-list-homepage']//div[1]//div[3]//a[1]");

    public void verifyHomepage(){
        Assert.assertEquals(ActualURL,_ExpectedURL);
    }

    public void clickOnRegisterButton(){
        clickOnElement(_RegisterButton);
    }

    public void clickOnSearchButton(){
        clickOnElement(_SearchButton);
    }

    public void clickONFBButton(){javaScriptClick(_FBButton);}

    public void clickOnNewsLatterButton(){javaScriptClick(_NewsLatterButton);
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
}
