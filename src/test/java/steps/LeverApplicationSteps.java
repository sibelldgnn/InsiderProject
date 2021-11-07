package steps;

import com.thoughtworks.gauge.Step;
import pages.LeverApplicationPage;
import qa.factory.DriverFactory;

public class LeverApplicationSteps {

    private LeverApplicationPage leverApplicationPage = new LeverApplicationPage(DriverFactory.webDriver);

    @Step("Check to Jobs Details")
    public void check_the_jobs_details(){
        leverApplicationPage.checkJobDetails();
    }

    @Step("Check lever application")
    public void check_lever_application(){
        leverApplicationPage.checkLeverApplication();
    }
}
