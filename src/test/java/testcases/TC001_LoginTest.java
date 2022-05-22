package testcases;

import basetest.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_LoginTest extends BaseClass {

    @Test
    public void loginTest() throws InterruptedException{
        driver.get(strUrl);
        Thread.sleep(3000);
        loginpage.setUserName(strUserName);
        loginpage.setPassWord(strPassWord);
        Thread.sleep(1000);
        loginpage.clickLoginButton();
        Thread.sleep(10000);
        String pageTitle = driver.getTitle();

        Assert.assertEquals(assertStringTitle,pageTitle,"Test Passed");
    }
}