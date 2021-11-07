package steps;

import com.thoughtworks.gauge.Step;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import qa.factory.DriverFactory;

public class HomeSteps {

    private static String title;
    private HomePage homePage = new HomePage(DriverFactory.webDriver);

    @Step("User gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        title = homePage.getLoginPageTitle();
        System.out.println("Page title is: " + title);
    }

    @Step("Page title should be <expectedTitleName>")
    public void page_title_should_be(String expectedTitleName) {
        Assert.assertTrue("Insider home page is not opened",title.contains(expectedTitleName));
    }

    @Step("User click on More")
    public void user_click_on_more() {
     homePage.clickMore();
    }

    @Step("User click on Careers")
    public void user_click_on_careers() {
        homePage.clickMCareers();
    }


}
