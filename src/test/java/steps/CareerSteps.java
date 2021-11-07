package steps;

import com.thoughtworks.gauge.Step;
import pages.CareerPage;
import qa.factory.DriverFactory;

public class CareerSteps {

    private CareerPage careerPage = new CareerPage(DriverFactory.webDriver);


    @Step("User gets the text Location")
    public void user_gets_text_location(){
        careerPage.getLocation();
    }

    @Step("User gets the text Teams")
    public void user_gets_text_teams(){
        careerPage.getTeams();
    }

    @Step("Checks are insider blocks")
    public void checks_are_insider_blocks(){
        careerPage.checkInsiderBlock();
    }

    @Step("Click find your dream job")
    public void click_find_your_dream_job(){
        careerPage.clickJob();
    }


}
