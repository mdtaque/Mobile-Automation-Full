package iPhone;

import TextViewPage.TextView;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class TextViewTest extends Base {

    UiCatalog uiCatalog;
    TextView textView;
    @BeforeMethod
    public void navigate(){
        uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getTextView();
        textView = PageFactory.initElements(ad, TextView.class);
    }

    //@Test
    public void getText(){
        String actualText = textView.texts();
        String expected = "Now is the time for all good developers to come to serve their country.\n" +
                "\n" +
                "This text view can also use attributed strings.";
        Assert.assertEquals(actualText, expected);
    }
}
