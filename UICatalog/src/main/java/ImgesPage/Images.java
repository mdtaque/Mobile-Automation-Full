package ImgesPage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static common.Base.ad;

public class Images {
    @FindBy(xpath = "//XCUIElementTypeImage[@name=\"Images\"]")
    WebElement imageClick;
    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Duration\"]")
    WebElement duration;

    public void clickOnImage(){
        imageClick.click();
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

        public void swipe(){
        leftToRightSwipe(duration, 900);
        }
    }
