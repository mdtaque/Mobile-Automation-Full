package ButtonsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Buttons extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Gray\"]")
    WebElement backgroundImageGray;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]")
    WebElement buttonwWithImage;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Rounded\"]")
    WebElement roundedButton;

    public void clickOnGrayBImage() {
        //TestLogger.log(getClass().getSimpleName() + ": " + Base.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        backgroundImageGray.click();
    }
    public void clickOnButtonWithImage(){
        //TestLogger.log(getClass().getSimpleName() + ": " + Base.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        buttonwWithImage.click();
    }
    public void clickOnRoundedButton(){
        //TestLogger.log(getClass().getSimpleName() + ": " + Base.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        roundedButton.click();
    }




}
