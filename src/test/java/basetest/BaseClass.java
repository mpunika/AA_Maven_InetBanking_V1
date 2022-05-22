package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public LoginPage loginpage;
    public String strUrl = "https://demo.guru99.com/v4/";
    public String strUserName = "mngr407058";
    public String strPassWord = "myqUzaq";
    public String assertStringTitle = "Guru99 Bank Manager HomePage";

    @BeforeTest
    public void testSetup(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginpage = new LoginPage(driver);

    }
    @AfterMethod
    public void testTearDown(){
        driver.quit();
    }
}