package lt.erika.pom.test.knygos;

import lt.erika.pom.pages.baltosLankos.LoginPages;
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

        //testas prisijungti su validziais duomenimis


        LoginPages.enterEmail("vaerika1@gmail.com");
        LoginPages.enterPassword("baltoslankos");
        LoginPages.clickButtonSubmit();
        LoginPages.sleep(1000);

        actualText = LoginPages.readMessageName();

        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void testToLoginInvalidInfo(){
        String expectedText = "Prisijungti nepavyko. Įveskite duomenis iš naujo ir bandykite dar kartą" +
                "Dar neužregistravote paskyros";
        String actualText;


        //Testas su nevalidziais duomenimis

        LoginPages.enterEmail("paskyra@gmail.com");
        LoginPages.enterPassword("paskyra");
        LoginPages.clickButtonSubmit();
        LoginPages.sleep(1000);

        actualText= LoginPages.readMessage();

        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void testResetPasswordFunctionality(){
        String actualText;
        String expectedText = "IŠSIUNTĖME JUMS EL. LAIŠKĄ SU PRISIJUNGIMO INSTRUKCIJA";

        //testas  gauti slaptazodzio priminima

        LoginPages.clickbuttonforgotpassword();
        LoginPages.enterEmailAdress("vaerika1@gmail.com");
        LoginPages.clickButtonResetPassword();

        actualText= LoginPages.readMessage();

        Assert.assertEquals(actualText,expectedText);
    }
}

