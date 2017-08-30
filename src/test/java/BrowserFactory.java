import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

final public class BrowserFactory {

    static WebDriver driver = null;

    final static String FIREFOX = "firefox";

    final static String pathToGeckoDriver = "src/test/java/resources/geckodriver";

    private BrowserFactory() { }

    public static WebDriver getBrowser() {
        return getFirefoxDriver();
    }

    private static WebDriver getFirefoxDriver() {
        if (driver == null) {
            File file = new File(pathToGeckoDriver);
            System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
            System.setProperty("browser. download. defaultFolder", "src/test/resources");
            driver = new FirefoxDriver();
        }
        return driver;
    }

}

