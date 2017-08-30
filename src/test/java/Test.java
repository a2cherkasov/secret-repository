import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Test {

    @org.testng.annotations.Test
    private void runTest() {
        WebDriver driver = BrowserFactory.getBrowser();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        driver.get("http://tut.by");
        WebElement txbSearchArea = driver.findElement(By.id("search_from_str"));
        txbSearchArea.sendKeys("Qwer");
        WebElement btnSearch = driver.findElement(By.name("search"));
        btnSearch.click();
        webDriverWait.withMessage("Page not found").until(ExpectedConditions.presenceOfElementLocated(By.id("wholeSearch")));
        driver.quit();
    }

}