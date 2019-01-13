package BreakingNews;

import common.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.util.List;

public class NYPBreakingNews extends Base {
    @FindBy(id = "br.com.golmobile.nypost:id/headline_text_view")
    WebElement firstHeadline;
    @FindBy(id = "br.com.golmobile.nypost:id/notification_settings_header")
    WebElement notificationsText;
    @FindBy(id = "br.com.golmobile.nypost:id/turn_on_notifications_item")
    WebElement notificationIcon;
    @FindBy(id = "Menu")
    WebElement menu;
    @FindBy(id = "br.com.golmobile.nypost:id/large")
    WebElement largeTextSize;
    @FindBy(id = "br.com.golmobile.nypost:id/headline_text_view")
    WebElement entertainment;
    @FindBy(id = "br.com.golmobile.nypost:id/collection_title")
    WebElement entertainmentText;
    @FindBy(className = "android.widget.Switch")
    List<WebElement> notificationsItems;
    @FindBy(id = "br.com.golmobile.nypost:id/search_container")
    WebElement searchBox;
    @FindBy(id = "br.com.golmobile.nypost:id/search")
    WebElement typeSearchBox;
    @FindBy(className = "android.widget.TextView")
    WebElement newsLetter;
    @FindBy(id = "contact_fields_email")
    WebElement emailInput;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.TextView\n")
    WebElement termsConditions;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View\n")
    WebElement termsOfUse;

    public void firstNewsHeadline(){
        firstHeadline.click();
        Assert.assertTrue(true);
    }
    public void clickOnNotifications(){
        notificationIcon.click();
        Assert.assertTrue(true);
    }
    public void checkNotificationText(){
        clickOnNotifications();
        String actual = notificationsText.getText();
        String expected = "Keep up on breaking news and much more. Choose which alerts you want to receive.";
        Assert.assertEquals(actual, expected);
    }
    public void clickOnMenu(){
        menu.click();
        scrollAndClickByName("Settings");
        largeTextSize.click();
        Assert.assertTrue(true);
    }
    public void clickOnEntertainment() {
        menu.click();
        entertainment.click();
        Assert.assertTrue(true);
    }
    public void entertainmentTextCheck(){
        clickOnEntertainment();
        boolean actual = entertainment.isDisplayed();
        Assert.assertTrue(actual);
    }
    public void enableNotifications() {
        clickOnNotifications();
        int noOfItems = notificationsItems.size();
        Assert.assertEquals(noOfItems, 5);
    }
    public void typeOnSearchBox() throws InterruptedException {
        menu.click();
        searchBox.click();
        typeSearchBox.sendKeys("Sports", Keys.ENTER);
        sleep(3);
        Assert.assertTrue(true);
    }
    public void goToEmailNewsletter(){
        menu.click();
        scrollAndClickByName("Settings");
        newsLetter.click();
        emailInput.sendKeys("abc@gmail.com", Keys.ENTER);
    }
    public void checkTermsOfUse(){
        menu.click();
        scrollAndClickByName("Settings");
        termsConditions.click();
        boolean bl = termsOfUse.isDisplayed();
        Assert.assertTrue(bl);
    }
}
