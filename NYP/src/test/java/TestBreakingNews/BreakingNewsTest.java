package TestBreakingNews;

import BreakingNews.NYPBreakingNews;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BreakingNewsTest extends Base {
    NYPBreakingNews objOfBreakingNews;

    @BeforeMethod
    public void init(){
        objOfBreakingNews = PageFactory.initElements(ad, NYPBreakingNews.class);
    }
    @Test(enabled = false)
    public void testHeadline(){
        objOfBreakingNews.firstNewsHeadline();
    }
    @Test(enabled = false)
    public void notificationClick(){
        objOfBreakingNews.clickOnNotifications();
    }
    @Test(enabled = false)
    public void notificationsText(){
        objOfBreakingNews.checkNotificationText();
    }
    @Test(enabled = false)
    public void clickMenu(){
        objOfBreakingNews.clickOnMenu();
    }
    @Test(enabled = false)
    public void clickEntertainment() {
        objOfBreakingNews.clickOnEntertainment();
    }
    @Test(enabled = false)
    public void enterTText(){
        objOfBreakingNews.entertainmentTextCheck();
    }
    @Test(enabled = false)
    public void enableNYMetro() {
        objOfBreakingNews.enableNotifications();
    }
    @Test(enabled = false)
    public void typeOnSearchBox() throws InterruptedException {
        objOfBreakingNews.typeOnSearchBox();
    }
    @Test(enabled = false)
    public void emailNews(){
        objOfBreakingNews.goToEmailNewsletter();
    }
    @Test
    public void terms(){
        objOfBreakingNews.checkTermsOfUse();
    }
}
