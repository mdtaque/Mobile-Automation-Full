package PickersPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class Picker extends Base {
    public void selectPickerTwoWheels(String name, String number){
        //scrollKeys(ad, new String[]{name,number});
    }

    @FindBy(className = "XCUIElementTypeScrollView")
    List<WebElement> UIPickerClassName;
    @FindBy(id = "UIDatePicker")
    WebElement UIDatePickerLocator;
    @FindBy(id = "Custom")
    WebElement custom;

    public void getUIPicker(){
        UIPickerClassName.get(0).click();
    }
    public void getUIDatePicker(){
        UIDatePickerLocator.click();
    }
    public void getCustom(){
        custom.click();
    }
}
