package lt.erika.pom.test.knygos;


import lt.erika.pom.pages.baltosLankos.BooksPages;
import lt.erika.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BooksTest extends TestBase {

    @BeforeMethod
    public void setUp() {
        BooksPages.open();
        BooksPages.closeAd();
    }

    @Test
    public static void testToAddBookToCartMultipletimes() {
        String expectedText = "ĮDĖTA Į KREPŠELĮ";
        String actualText;

        BooksPages.enterBookTittle("ugly love");
        BooksPages.clickSearchButton();
        BooksPages.clickOn();



        actualText = BooksPages.readMessage();
        Assert.assertEquals(actualText,expectedText);
    }

}

