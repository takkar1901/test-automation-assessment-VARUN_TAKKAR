package IceHrm.test;

import Utilities.AppErrors;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends  BaseTest{
//first test
    @Test
    public void loginPageTitleTest(){
String title = loginPage.getLoginPageTitle();
        System.out.println("Login Page title is: " + title);
        Assert.assertEquals(title,"IceHrm Login", AppErrors.TITLE_ERROR_MSG);
    }
//2nd test
@Test
    public void loginPageHeaderTest(){
        String header = loginPage.getPageHeaderText();
    System.out.println("Login page header is" + header);
    Assert.assertEquals(header,"IceHrm Login", AppErrors.HEADER_ERROR_MSG);
}
//3rd test
@Test
    public void forgotPwdLinkTest(){
        boolean b = loginPage.resetPwdLinkExist();
        Assert.assertTrue(loginPage.resetPwdLinkExist());

    }

    @Test
    public void loginTest(){
        loginPage.doLogin();
    }

}
