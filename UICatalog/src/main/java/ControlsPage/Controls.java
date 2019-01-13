package ControlsPage;

import common.Base;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * Created by mrahman on 1/15/17.
 */
public class Controls extends Base {
    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Standard\"]")
    WebElement standardSwitch;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Standard Slider\"]")
    WebElement standardSlider;
    @FindBy(id = "Ten Pages")
    WebElement tenPages;
    @FindBy(id = "Progress")
    public static WebElement styleDefault;
    @FindBy(id = "Decrement")
    String stepper;


    public void clickOnStandardSwitch(){
        standardSwitch.click();
    }
    public void slideOnStandardSlider() throws InterruptedException {
        standardSlider.click();
        Thread.sleep(3000);
    }
    public void clickOnTenPages(){
        tenPages.click();
    }
    public void clickOnStyleDefault(){
       styleDefault.click();
    }
    public void clickOnDecrement() throws InterruptedException {
        scrollAndClickByName(stepper);
        Thread.sleep(3000);
    }

    public void leftToRightSwipe(WebElement element, int durationInMs){
        Dimension size = ad.manage().window().getSize();
        System.out.println(size);
        int startx = (int) (size.width * 0.70);
        int endx = (int) (size.width * 0.30);
        int starty = size.height/2;
        ad.swipe(endx, starty, startx, starty, durationInMs);
        //ad.swipe(startx, starty, endx, starty, durationInMs); //for rightToLeftSwipe
    }

    public void swipe() throws InterruptedException {
        leftToRightSwipe(standardSlider, 3000);
        Thread.sleep(3000);
    }


}
