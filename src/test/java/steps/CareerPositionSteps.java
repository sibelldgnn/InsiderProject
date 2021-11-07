package steps;

import com.thoughtworks.gauge.Step;
import pages.CareerPositionPage;
import qa.factory.DriverFactory;

public class CareerPositionSteps {

    private CareerPositionPage careerPositionPage = new CareerPositionPage(DriverFactory.webDriver);

    @Step("Click filter location")
    public void click_filter_location(){
        careerPositionPage.clickFilter();
    }

    @Step("Select filter location")
    public void select_filter_location(){
        careerPositionPage.selectLocations();
    }

    @Step("Click filter department")
    public void click_filter_department(){
        careerPositionPage.clickFilterDepartment();
    }

    @Step("Select filter department")
    public void select_filter_department(){
        careerPositionPage.selectDepartment();
    }

    @Step("Click apply for this job")
    public void click_apply_for_this_job(){
        careerPositionPage.clickApplyJob();
    }

    @Step("Check job list")
    public void check_job_list(){
        careerPositionPage.checkList();
    }

    @Step("Click accept")
    public void click_accept(){
        careerPositionPage.clickAccept();
    }

    @Step("Should be jobs list")
    public void should_be_jobs_list(){
        careerPositionPage.jobsList();
    }

    @Step("Click job item")
    public void click_job_item(){
        careerPositionPage.clickJobItem();
    }
}
