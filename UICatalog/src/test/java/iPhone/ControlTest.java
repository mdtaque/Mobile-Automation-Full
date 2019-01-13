package iPhone;

import ControlsPage.Controls;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ControlTest extends Base {

    Controls controls;
    UiCatalog uiCatalog;
    @BeforeMethod
    public void init() {
        uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getControls();
        controls = PageFactory.initElements(ad, Controls.class);
    }
    //@Test
    public void standardSwitch(){
        controls.clickOnStandardSwitch();
    }
    //@Test
    public void sSlider() throws InterruptedException {
        controls.slideOnStandardSlider();
    }
    //@Test
    public void testTenPages(){
        controls.clickOnTenPages();
    }
    //@Test
    public void testStyleDefault(){
        controls.clickOnStyleDefault();
    }
    //@Test
    public void testStepper() throws InterruptedException {
        controls.clickOnDecrement();
    }
    @Test
    public void testswipe() throws InterruptedException {
        controls.swipe();
    }



}
