package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static qa.factory.DriverFactory.webDriver;

public class CareerPage {

    private WebDriver driver;

    private By locations = By.xpath(("//h3[contains(text(),'Our Locations')]"));
    public static By ourStoryBlocks = By.xpath("//h2[contains(text(),'Our story')]");
    public static By teamsBlocks = By.xpath("//a[contains(text(),'See all teams')]");
    public static By locationBlocks = By.xpath("//h3[contains(text(),'Our Locations')]");
    public static By lifeAtInsiderBlocks = By.xpath("//h2[contains(text(),'Life at Insider')]");
    private By jobs = By.xpath(("//*[@id='page-head']/div/div/div[1]/div/div/a"));

    public CareerPage(WebDriver driver) {
        this.driver = driver;
    }

    protected boolean displayed(By by) {
        return webDriver.findElement(by).isDisplayed();
    }

    public void getLocation() {

        Assert.assertTrue("Location Block is not", displayed(locations));


    }

    public void getTeams() {

        boolean result = driver.findElement(locations).isEnabled();
        Assert.assertTrue("true",result);
    }

    public void checkInsiderBlock() {

        Assert.assertTrue("Our Story Block is not seen",driver.findElement(ourStoryBlocks).isDisplayed());

        Assert.assertTrue("Teams Block is not seen",driver.findElement(teamsBlocks).isDisplayed());

        Assert.assertTrue("Location Block is not seen",driver.findElement(locationBlocks).isDisplayed());

        Assert.assertTrue("Life At Insider is not seen",driver.findElement(lifeAtInsiderBlocks).isDisplayed());
    }

    public void clickJob() {
        driver.findElement(jobs).click();

    }
}
