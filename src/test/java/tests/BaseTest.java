package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import utils.Driver;
import utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    @BeforeClass
    public void init() {
        Driver.initialize();
    }

    @AfterClass
    public void quit() {
        Driver.quit();
    }
}
