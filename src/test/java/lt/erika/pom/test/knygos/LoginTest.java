package lt.erika.pom.test.knygos;

import lt.erika.pom.pages.baltosLankos.LoginPages;
import lt.erika.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    public void setUp(){
        LoginPages.open();
        LoginPages.closeAd();
    }
    @Test
    public void testToLoginValidInfo(){

        String expectedText = "MANO PASKYRA";
        String actualText;

        LoginPages.enterEmail("vaerika1@gmail.com");
        LoginPages.enterPassword("baltoslankos");
        LoginPages.clickButtonSubmit();
        LoginPages.sleep(1000);

        actualText = LoginPages.readMessageName();
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void testToLoginInvalidInfo(){
        String expectedText ="Prisijungti nepavyko.";
        String actualText;

        LoginPages.enterEmail("paskyra@gmail.com");
        LoginPages.enterPassword("paskyra");
        LoginPages.clickButtonSubmit();
        LoginPages.sleep(1000);

        actualText= LoginPages.readMessage();
        Assert.assertTrue(actualText.contains(expectedText));

    }
    @Test
    public void testResetPasswordFunctionality(){
        String actualText;
        String expectedText = "IŠSIUNTĖME JUMS EL. LAIŠKĄ SU PRISIJUNGIMO INSTRUKCIJA";

        LoginPages.clickButtonForgotPassword();
        LoginPages.enterEmailAddress("vaerika1@gmail.com");
        LoginPages.clickButtonResetPassword();

        actualText = LoginPages.readReport();
        Assert.assertEquals(actualText,expectedText);
    }
}

