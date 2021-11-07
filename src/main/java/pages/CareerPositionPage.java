package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class CareerPositionPage {

    private WebDriver driver;

    private By filter = By.xpath("//span[@id='select2-filter-by-location-container']");
    private By selectLocation = By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[13]");
    private By filterDepartment = By.xpath("//span[@id='select2-filter-by-department-container']");
    private By selectDepartment = By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[14]");
    private By accept = By.xpath("//*[@id=\"wt-cli-accept-btn\"]");
    public static By positionTitle = By.xpath("//div[@class='position-list-item-wrapper bg-light']/p");
    public static By positionDepartment = By.className("position-department");
    public static By positionLocation = By.className("position-location");
    private By applyJob = By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[2]/a[1]");
    private By checklist = By.xpath("//div[@id='jobs-list']");

    List<WebElement> positionElements;
    List<WebElement> departmentElements;
    List<WebElement> locationElements;

    public CareerPositionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDepartment(){
        scrollToProductCount2(selectDepartment);
        driver.findElement(selectDepartment).click();
    }

    public void checkList() {
        boolean result = driver.findElement(checklist).isEnabled();
        Assert.assertTrue("Job list not Checked",result);

    }

    public void jobsList(){
        positionElements = driver.findElements(positionTitle);
        departmentElements = driver.findElements(positionDepartment);
        locationElements = driver.findElements(positionLocation);

        for (int i=1; i<positionElements.size(); i++) {
            Assert.assertTrue("Pozition is not equal", positionElements.get(i).getText().contains(DataModel.Data.positionDepartmentName));
            Assert.assertTrue("Pozition Department is not equal", departmentElements.get(i).getText().contains(DataModel.Data.positionDepartmentName));
            Assert.assertTrue("Pozition Location is not equal", locationElements.get(i).getText().contains(DataModel.Data.positionLocationName));
        }

    }

    public void clickFilter() {
        driver.findElement(filter).click();

    }

    public void scrollToProductCount(By increase) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(increase));

    }

    public void clickJobItem(){

        List<WebElement> allProducts = driver.findElements(By.xpath("//a[contains(text(),'Apply Now')]"));

        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        for(int i=0;i<=randomProduct;i++) {

            System.out.println(allProducts.get(i));
            String geting = allProducts.get(i).getText();
            //please add your file path
            File file = new File(
                    "C:\\Users\\asus\\InsiderProject\\src\\test\\resources\\File\\product.txt");
            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bfw = new BufferedWriter(fw);
                bfw.write(geting);
                bfw.newLine();
                bfw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        allProducts.get(randomProduct).click();

    }

    public void selectLocations(){
        scrollToProductCount(selectLocation);
        driver.findElement(selectLocation).click();
    }

    public void clickFilterDepartment() {
        driver.findElement(filterDepartment).click();

    }

    public void scrollToProductCount2(By increase2) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(increase2));

    }

    public void clickAccept() {
        driver.findElement(accept).click();

    }

    public void clickApplyJob() {
        driver.findElement(applyJob).click();

    }
}
