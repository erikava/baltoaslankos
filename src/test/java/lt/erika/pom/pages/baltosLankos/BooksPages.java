package lt.erika.pom.pages.baltosLankos;

import lt.erika.pom.pages.Common;
import lt.erika.pom.pages.Locators;

public class BooksPages {

    public static void open() {
        Common.openUrl("https://www.baltoslankos.lt/knygos");
    }

    public static void clickOnBook() {
        Common.clickElement(
                Locators.Books.clickBook
        );

    }

    public static void clickAddToCart() {
        Common.clickElement(
                Locators.Books.clickAddButton
        );

    }

    public static void doubleClickToAddMore() {
        Common.doubleClick(
                Locators.Books.buttonAddMore
        );

    }

    public static String readMessage() {
        return Common.getElementText(
                Locators.Books.productAddedToCartTittle
        );
    }

    public static void closeAd() {
        Common.waitForElementToBeVisible(
                Locators.Login.formAd
        );
        Common.clickElement(
                Locators.Login.buttonCloseAd
        );
    }
}




