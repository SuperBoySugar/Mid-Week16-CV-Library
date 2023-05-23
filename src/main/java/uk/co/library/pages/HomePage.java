package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy (id = "keywords")
    WebElement jobTitle;


    @CacheLookup
    @FindBy (id = "location")
    WebElement location;

    @CacheLookup
    @FindBy (id = "distance")
    WebElement distance;

    @CacheLookup
    @FindBy (id = "toggle-hp-search")
    WebElement moreSearchOption;

    @CacheLookup
    @FindBy (id = "salarymin")
    WebElement salaryMin;

    @CacheLookup
    @FindBy (id = "salarymax")
    WebElement salaryMax;

    @CacheLookup
    @FindBy (id = "salarytype")
    WebElement salaryType;

    @CacheLookup
    @FindBy (id = "tempperm")
    WebElement jobType;

    @CacheLookup
    @FindBy (id = "hp-search-btn")
    WebElement findJobsBtn;

    public void enterJobTitleField(String jobTitle1){
    //    Reporter.log("Enter Job Title Field: "+jobTitle.toString()+"<br>");
        sendKeysToElement(jobTitle,jobTitle1);
     //   CustomListeners.test.log(Status.PASS," Enter Job Title Field" );
    }

    public void enterLocationField(String location1){
     //   Reporter.log("Enter Location Field: "+location.toString()+"<br>");
        sendTextToElement(location, location1);
    //    CustomListeners.test.log(Status.PASS," Enter Location Field" );
    }

    public void selectDistance(String distance1){
     //   Reporter.log("Select Distance: "+distance.toString()+"<br>");
        selectByVisibleTextFromDropDown(distance, distance1);
     //   CustomListeners.test.log(Status.PASS,"Select Distance" );
    }

    public void clickOnSearchOption(){
     //   Reporter.log("Click On Search Option: "+moreSearchOption.toString()+"<br>");
        clickOnElement(moreSearchOption);
     //   CustomListeners.test.log(Status.PASS," Click On Search Option" );
    }

    public void enterSalaryMinField(String salaryMin1){
     //   Reporter.log("Enter Salary Min Field: "+salaryMin.toString()+"<br>");
        sendTextToElement(salaryMin, salaryMin1);
     //   CustomListeners.test.log(Status.PASS," Enter Salary Min Field" );
    }
    public void enterSalaryMaxField(String salaryMax1){
     //   Reporter.log("Enter Salary Max Field: "+salaryMax.toString()+"<br>");
        sendTextToElement(salaryMax, salaryMax1);
     //   CustomListeners.test.log(Status.PASS," Enter Salary Max Field: " + salaryMax1 );
    }

    public void selectSalaryType(String salaryType1){
    //    Reporter.log("Select Salary type: "+salaryType.toString()+"<br>");
        selectByVisibleTextFromDropDown(salaryType, salaryType1);
    //   CustomListeners.test.log(Status.PASS," Select Salary type" );
    }

    public void selectJobType(String jobType1){
    //    Reporter.log("Select Job Type: "+jobType.toString()+"<br>");
        selectByVisibleTextFromDropDown(jobType, jobType1);
     //   CustomListeners.test.log(Status.PASS," Select Job Type" );
    }

    public void clickOnFindJobsBtn(){
    //    Reporter.log("Click On Find Jobs Btn: "+findJobsBtn.toString()+"<br>");
        clickOnElement(findJobsBtn);
    //    CustomListeners.test.log(Status.PASS," Click On Find Jobs Btn" );
    }

}
