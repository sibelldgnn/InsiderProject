package qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverWaitP {

    private WebDriver driver;

    public DriverWaitP(WebDriver driver) {
        this.driver = driver;
    }

    public void Wait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250));
    }

}
