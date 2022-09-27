package lt.erika.pom.test.knygos;


import lt.erika.pom.pages.baltosLankos.BooksPages;
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
    public static void testToAddBookToCart() {
        String expectedText = "ĮDĖTA Į KREPŠELĮ";
        String actualText;



        BooksPages.clickOnBook();
        BooksPages.doubleClickToAddMore();
        BooksPages.clickAddToCart();

        actualText = BooksPages.readMessage();
        Assert.assertEquals(actualText,expectedText);
    }

}

