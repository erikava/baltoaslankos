package lt.erika.pom.test.knygos;

import lt.erika.pom.pages.baltosLankos.BookSearchPages;
import lt.erika.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookSearchTest extends TestBase {

    @BeforeMethod
    public void setUp(){
        BookSearchPages.open();
        BookSearchPages.closeAd();
    }

    @Test
    public void testSearchBookAndAddToCart(){
        String expectedText = "Įdėta į krepšelį";
        String actualText;

        BookSearchPages.clickSearchBoxButton();
        BookSearchPages.clickOnExtendedSearchButton();
        BookSearchPages.selectAuthorFromDropdownList("694");
        BookSearchPages.clickSearchButton();
        BookSearchPages.sleep(1000);
        BookSearchPages.clickOnBook();

        actualText = BookSearchPages.readBookTitle();

        Assert.assertEquals(actualText,expectedText);

    }
}
