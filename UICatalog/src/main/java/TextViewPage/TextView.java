package TextViewPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextView {

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextView\n")
    WebElement textView;

    public String texts(){
        String texts = textView.getText();
        return texts;
    }
}
