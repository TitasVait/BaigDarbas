package tests.tiketa;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Shop extends BaseTest {
    @BeforeClass
    public void openLink() {
        pages.Common.openLink("https://www.tiketa.lt/EN/parduotuve");
        pages.tiketa.Login.acceptAll();
    }
    @Test
    public void testShoppingBasket(){
        //1. Click any Buy button
        //2. Click Buy button again
        //3. Click buy without login
        //4. Click on a good sector
        //5. Click Find tickets
        //6. Click next
        //7. Go to the home page by clicking the logo
        //8.Check if there is a shopping basket
        pages.tiketa.Shop.clickOnBuy();
        pages.tiketa.Shop.clickOnBuyAgain();
        pages.tiketa.Shop.clickOnNoLogin();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pages.tiketa.Shop.clickOnAvailableSector();

    }
}
