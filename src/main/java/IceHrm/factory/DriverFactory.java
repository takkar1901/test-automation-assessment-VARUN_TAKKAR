package IceHrm.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public WebDriver driver;
    /* this method is used to intialise the webdriver */
    public WebDriver initDriver(String browserName){
        System.out.println("browser name is : " + browserName);

        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
        else {
            System.out.println("Please pass the correct browserName: " + browserName);
        }

        driver.manage().window().maximize();
        driver.get("https://icehrm-open.gamonoid.com/");

        return driver;
    }





}
