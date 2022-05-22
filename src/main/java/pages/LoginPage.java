package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
@FindBy(name="uid")
@CacheLookup
WebElement txtUserName;

@FindBy(name="password")
@CacheLookup
WebElement txtPassWord;

@FindBy(name="btnLogin")
@CacheLookup
WebElement btnLogin;

    public void setUserName(String strUserName){
        txtUserName.clear();
        txtUserName.sendKeys(strUserName);
    }

    public void setPassWord(String strPassWord){
        txtPassWord.clear();
        txtPassWord.sendKeys(strPassWord);
    }
    public void clickLoginButton(){
        btnLogin.isEnabled();
        btnLogin.click();
    }
}