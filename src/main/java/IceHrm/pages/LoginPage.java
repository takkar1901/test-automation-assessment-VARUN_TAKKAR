package IceHrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    WebElement Username = driver.findElement(By.id("username"));
    WebElement Password = driver.findElement(By.id("password"));
    WebElement ResetPass = driver.findElement(By.xpath("a[class=text-info]"));
    WebElement Login = driver.findElement(By.xpath(" //*[@id=\"loginForm\"]/div[4]/button"));
WebElement Header = driver.findElement(By.xpath("//a[@class='logo']/@href"));

    //constructor
    public LoginPage(WebDriver driver) {
this.driver = driver;
    }

    // page methods- define behavior of the page
    //1. capturing title of the page
    public String getLoginPageTitle(){
        return driver.getTitle();
    }
    //capturing page header
    public String getPageHeaderText()
    {
       return Header.getText();
    }
//capturing forgot pwd link present on page or not
    public boolean resetPwdLinkExist(){
       return ResetPass.isDisplayed();
    }
public void doLogin(){
        Username.sendKeys("admin");
    Password.sendKeys("admin");
    Login.click();
}


    }
