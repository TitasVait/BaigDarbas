package tests.tiketa;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Shop {
    @BeforeClass
    public void openLink() {
        pages.Common.openLink("https://www.tiketa.lt/EN/parduotuve");
//        pages.Common.cookiesAndReload();
    }
    @Test
    public void testShoppingBasket(){
        //1. Click any Buy button
        //2. Click Buy button again
        //3. Click on a good sector
        //4. Click Find tickets
        //5. Click next
        //6. Go to the home page by clicking the logo
        //7.Check if there is a shopping basket

    }
}
