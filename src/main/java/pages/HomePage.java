package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    public static org.apache.log4j.Logger logger = Logger.getLogger(HomePage.class);
    private WebDriver driver;
    private By clickOnMore = By.xpath("//span[contains(text(),'More')]");
    private By clickOnCareers = By.xpath("//h5[contains(text(),'Careers')]");

    public static By teams = By.xpath(("//a[contains(text(),'See all teams')]"));



    public static By jobItem = By.xpath("//body/section[@id='career-position-list']/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public void clickMore(){
        driver.findElement(clickOnMore).click();
    }

    public void clickMCareers(){
        driver.findElement(clickOnCareers).click();
    }


}
