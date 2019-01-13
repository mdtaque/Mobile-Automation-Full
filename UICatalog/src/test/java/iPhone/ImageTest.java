package iPhone;

import ButtonsPage.Buttons;
import ImgesPage.Images;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class ImageTest extends Base {

    Images images;
    @BeforeMethod
    public void navigate(){
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getImages();
        images = PageFactory.initElements(ad, Images.class);
    }
    //@Test
    public void testSwipe(){
        images.swipe();
    }
    @Test
    public void clickImage(){
        images.clickOnImage();
    }
}
