package lt.erika.pom.test.knygos;

import lt.erika.pom.pages.baltosLankos.Common;
import lt.erika.pom.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class TestBase {

    @AfterMethod
    public void teardown() {
        Common.closeDriver();
    }
}
