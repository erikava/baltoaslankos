package lt.erika.pom.pages.baltosLankos;

import lt.erika.pom.pages.Common;
import lt.erika.pom.pages.Locators;

public class BooksPages {

    public static void open() {
        Common.openUrl("https://www.baltoslankos.lt/knygos");
    }

    public static void closeAd() {
        Common.waitForElementToBeVisible(
                Locators.Login.formAd
        );
        Common.clickElement(
                Locators.Login.buttonCloseAd
        );
    }
    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public static void enterBookTittle(String bookName) {
        Common.sendKeysToElement(
                Locators.Books.bookTittle, bookName
        );
    }
    public static void clickSearchButton() {
        Common.clickElement(
                Locators.Books.clickSearchButton
        );
    }
    public static void clickOnBookUglyLove() {
        Common.clickElement(
                Locators.Books.bookUglyLove
        );
    }
    public static void addMultipleTimes() {
        Common.doubleClick(
                Locators.Books.clickUnits
        );
    }
    public static void clickOnOrderButton() {
        Common.clickElement(
                Locators.Books.orderButton
        );
    }
    public static String readText() {
        return Common.getElementText(
                Locators.Books.units
        );
    }
}






