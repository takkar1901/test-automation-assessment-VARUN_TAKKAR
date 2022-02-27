package IceHrm.test;

import IceHrm.factory.DriverFactory;
import IceHrm.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;
    DriverFactory drifac;
LoginPage loginPage;

@BeforeTest
    public  void setUp(){
drifac = new DriverFactory();
driver = drifac.initDriver("chrome");/*calling initDrive fn from Drivefactory class which is returning driver, so we
    can store it in driver(same type of variable) here in basetest class*/
loginPage = new LoginPage(driver);//creating obj of loginPage class giving it that captured driver



}





}
