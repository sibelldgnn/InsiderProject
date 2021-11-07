package steps;

import com.thoughtworks.gauge.Step;
import qa.factory.DriverFactory;
import qa.factory.DriverWaitP;

public class DriverWaitSteps {

    private DriverWaitP driverWaitP = new DriverWaitP(DriverFactory.webDriver);

    @Step("Driver wait")
    public void driver_wait() throws InterruptedException{
        Thread.sleep(5000);
        driverWaitP.Wait();
    }
}
