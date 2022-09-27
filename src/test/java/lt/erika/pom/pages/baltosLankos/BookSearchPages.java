package lt.erika.pom.pages.baltosLankos;

public class BookSearchPages {
    public static void open() {
        Common.openUrl("https://www.baltoslankos.lt/");
    }

    public static void closeAd() {
        Common.waitForElementToBeVisible(
                Locators.Login.formAd
        );
        Common.clickElement(
                Locators.Login.buttonCloseAd
        );
    }


    public static void clickSearchBoxButton() {
        Common.clickElement(
                Locators.BookSearch.searchBoxButton
        );
    }

    public static void clickOnExtendedSearchButton() {
        Common.clickElement(
                Locators.BookSearch.extendedSearchButton
        );


    }

    public static void selectAuthorFromDropdownList(String value) {
        Common.selectOptionsByValue(
                Locators.BookSearch.selectAuthor,
                value
        );
    }

    public static void clickSearchButton() {
        Common.clickElement(
                Locators.BookSearch.advancedButton
        );
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void clickOnBook() {
        Common.clickElement(
                Locators.BookSearch.ButtonBook

        );

    }

    public static String readBookTitle() {
        return Common.getElementText(
                Locators.BookSearch.bookTitle
        );

    }
}




