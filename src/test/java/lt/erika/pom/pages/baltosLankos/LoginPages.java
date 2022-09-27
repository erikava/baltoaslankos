package lt.erika.pom.pages.baltosLankos;

import lt.erika.pom.pages.Common;
import lt.erika.pom.pages.Locators;

public class LoginPages {

    public static void open() {
        Common.openUrl("https://www.baltoslankos.lt/login");
    }

    public static void enterEmail(String EmailText) {
        Common.sendKeysToElement(
                Locators.Login.inputUserName,
                EmailText
        );
    }

    public static void clickButtonSubmit() {
        Common.clickElement(Locators.Login.buttonSubmit);

    }

    public static void enterPassword(String passwordText) {
        Common.sendKeysToElement(Locators.Login.inputPassword, passwordText);

    }

    public static String readMessageName() {
        return Common.getElementText(Locators.Login.userName);

    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void closeAd() {
        Common.waitForElementToBeVisible(
                Locators.Login.formAd
        );
        Common.clickElement(
                Locators.Login.buttonCloseAd
        );
    }

    public static String readMessage() {
        return Common.getElementText(Locators.Login.errormessage);
    }

    public static void clickbuttonforgotpassword() {
        Common.clickElement(Locators.Login.buttonForgotPassword);

    }

    public static void clickButtonResetPassword() {
        Common.clickElement(Locators.Login.buttonResetPassword);

    }

    public static void enterEmailAdress(String EmailText) {
        Common.sendKeysToElement(Locators.Login.inputEmail,
                EmailText);
    }
}

