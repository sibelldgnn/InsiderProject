package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static qa.factory.DriverFactory.webDriver;

public class LeverApplicationPage {

    private WebDriver driver;

    public By leverApplication = By.xpath("//h4[contains(text(),'Submit your application')]");
    public By positionDetailsPage = By.className("posting-headline");
   // public By position = By.cssSelector("div.posting-headline > h2");
    public By applyForThisJob = By.cssSelector("div.postings-btn-wrapper > a");
    public By positionDescription = By.cssSelector("div:nth-child(2) > div> h3");
    public By positionRequirements = By.cssSelector("div:nth-child(3) > div > h3");

    public LeverApplicationPage(WebDriver driver) {
        this.driver = driver;
    }

    protected void windowHandle() {
        String currentTabHandle = webDriver.getWindowHandle();
        String newTabHandle = webDriver.getWindowHandles()
                .stream()
                .filter(handle -> !handle.equals(currentTabHandle ))
                .findFirst()
                .get();
        webDriver.switchTo().window(newTabHandle);
    }

    public void checkJobDetails(){
        windowHandle();
        Assert.assertTrue("Pozisyon detail is not  opened",driver.findElement(positionDetailsPage).isDisplayed());
        Assert.assertTrue("Apply For This Job button is not opened",driver.findElement(applyForThisJob).isDisplayed());
        //  Assert.assertEquals("Pozition details is not true",DataModel.Data.chosenPosition,driver.findElement(position).getText());
        Assert.assertTrue("Requirement details is not seen",driver.findElement(positionRequirements).isDisplayed());
        Assert.assertTrue("Description details is not seen",driver.findElement(positionDescription).isDisplayed());
    }

    public void checkLeverApplication() {
        Assert.assertEquals("Lever application page is not opened",driver.findElement(leverApplication).getText(),"SUBMIT YOUR APPLICATION");

    }

}
