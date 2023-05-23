package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    @CacheLookup
    @FindBy (xpath = "//div[@class='search-header__left']")
    WebElement result;

    public void verifyResult(String expectedMessage){
     //   Reporter.log("Verify Result: "+result.toString()+"<br>");
        verifyElements(result, expectedMessage,"Error");
     //   CustomListeners.test.log(Status.PASS," Verify Result: " + expectedMessage );
    }
}
