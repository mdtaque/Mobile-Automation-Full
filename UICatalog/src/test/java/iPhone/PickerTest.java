package iPhone;

import PickersPage.Picker;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PickerTest extends Base {
    String[] pickerName = {"Chris Armstrong","3"};
    String[] pickerDate = {"March","10","2016"};

    Picker picker;

    @BeforeMethod
    public void init(){
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getPickers(); //ad.scrollTo("Pickers").click();
        picker = PageFactory.initElements(ad, Picker.class);
    }
    //@Test
    public void testCustom(){
        picker.getCustom();
        scrollToElement(ad, "Evening");
    }
    @Test
    public void testUIPicker(){
        picker.getUIPicker();//.selectPickerTwoWheels("Chris Armstrong","3");
        scrollKeys(ad, pickerName,"//UIAPicker[1]");

    }
    //@Test
    public void testDatePicker() throws InterruptedException {
        picker.getUIDatePicker();
        Thread.sleep(2000);
        scrollKeys(ad, pickerDate, "//UIAPicker[2]");
    }
}
