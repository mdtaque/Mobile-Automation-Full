package iPhone;

import ButtonsPage.Buttons;
import common.Base;
import navigate.NavigateUi;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonTest extends Base {

    Buttons buttons;
    @BeforeMethod
    public void navigate(){
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getButtonPage();
        buttons = PageFactory.initElements(ad, Buttons.class);
    }
    @Test
    public void clickOnGray() {
        buttons.clickOnGrayBImage();
    }
    @Test
    public void clickOnImage(){
        buttons.clickOnButtonWithImage();
    }
    @Test
    public void clickOnRoundedButton(){
        buttons.clickOnRoundedButton();
    }
}
