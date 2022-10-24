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
    public static void testToAddBookToCartMultipleTimes() {
        String expectedText = "Kiekis : 3";
        String actualText;

        BooksPages.enterBookTittle("ugly love");
        BooksPages.clickSearchButton();
        BooksPages.clickOnBookUglyLove();
        BooksPages.addMultipleTimes();
        BooksPages.clickOnOrderButton();
        BooksPages.sleep(1000);

        actualText = BooksPages.readText();//neperskaito zinutes,nes ne visada pilnai uzkrauna puslapi
        Assert.assertEquals(actualText,expectedText);
    }
}

