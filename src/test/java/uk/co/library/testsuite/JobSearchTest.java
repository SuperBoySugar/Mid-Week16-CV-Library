package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customelisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {

    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        resultPage = new ResultPage();
    }


    @Test (groups = {"smoke", "regression"}, dataProvider = "Job Search", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle1, String location1, String distance1,
                                                           String salaryMin1, String salaryMax1, String salaryType1, String jobType1) {

        // enter job title 'jobTitle'
        homePage.enterJobTitleField(jobTitle1);
        //  enter Location 'location'
        homePage.enterLocationField(location1);
        //  select distance 'distance'
        homePage.selectDistance(distance1);
        // click on moreSearchOptionsLink
        homePage.clickOnSearchOption();
        //  enter salaryMin 'salaryMin'
        homePage.enterSalaryMinField(salaryMin1);
        // enter salaryMax 'salaryMax'
        homePage.enterSalaryMaxField(salaryMax1);
        // select salaryType 'salaryType'
        homePage.selectSalaryType(salaryType1);
        // select jobType 'jobType'
        homePage.selectJobType(jobType1);
        // click on 'Find Jobs' button
        homePage.clickOnFindJobsBtn();
        // Verify the Result
        resultPage.verifyResult("Permanent Tester jobs in RH1 1AA\n" +
                "Displaying 1-25 of 128 jobs");

    }
}