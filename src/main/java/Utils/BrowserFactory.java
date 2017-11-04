package Utils;


import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by Sudhakar on 05/10/2017.
 */
public class BrowserFactory {
    public static WebDriver driver;

    public static WebDriver startBrowser(String Browser, String URL) throws MalformedURLException, InterruptedException {
        if (driver == null || !isSessionActive()) {
            driver = startRemoteWebBrowser(Browser, URL);
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static boolean isSessionActive() {
        try {
            return driver.findElements(By.tagName("body")).size() > 0;
        } catch (Exception e) {

        }
        return false;
    }

    public static WebDriver startRemoteWebBrowser(String browser, String URL) {
        if (AutomationConstants.REMOTE_BROWSER.equalsIgnoreCase("true")) {
            try {
                System.out.println("grid started in BrowserStack...");

                DesiredCapabilities capabilities = new DesiredCapabilities();
                if (System.getProperty("Browser").equalsIgnoreCase("firefox")) {
                    capabilities = DesiredCapabilities.firefox();
                    capabilities.setPlatform(Platform.WIN8);
                    capabilities.setVersion("47");

                } else if (System.getProperty("Browser").equalsIgnoreCase("chrome")) {
                    capabilities = DesiredCapabilities.chrome();
                    capabilities.setPlatform(Platform.WIN10);
                    capabilities.setVersion("60");
                }

                String gridURL = AutomationConstants.SELENIUM_GRID_URL;
                driver = new RemoteWebDriver(new URL(gridURL), capabilities);
                capabilities.setCapability("browserstack.debug", "true");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else {

            if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/main/Browsers/geckodriver.exe");
                System.out.println("starting local firefox");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/main/Browsers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver", "src/main/Browsers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            } else if (browser.equalsIgnoreCase("Safari")) {
                System.setProperty("webdriver.safari.driver", "src/main/Browsers/SafariDriver.exe");
                driver = new SafariDriver();
            }
        }
        driver.get(URL);
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void stopBrowser() {
        driver.quit();
    }
}