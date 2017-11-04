package Utils;

import com.Pages.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

/**
 * Created by Sudhakar on 06/10/2017.
 */
public class Utilities extends BasePage{

    public static WebDriverWait wait = new WebDriverWait(driver, 30);

    public static WebElement waitForPresenceOfElement(WebElement ElementToBePresent) {
        return wait.until(ExpectedConditions.presenceOfElementLocated((By) ElementToBePresent));
    }

    public static WebElement waitForElementToBeClickable(WebElement ElementToBeClickable) {
        return wait.until(ExpectedConditions.elementToBeClickable(ElementToBeClickable));
    }

    public static WebElement waitForVisibilityOfElement(WebElement ElementToBeVisible) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated((By) ElementToBeVisible));
    }
    public static void hoverOver(WebDriver driver, WebElement hover) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hover).perform();
    }

//    public static void captureScreenshot(WebDriver driver, String screenshotName) throws IOException {
//        TakesScreenshot takesScreenshot = (TakesScreenshot) BrowserFactory.driver;
//        File sourceScreenShot = takesScreenshot.getScreenshotAs(OutputType.FILE);
//        File destinationScreenShot = new File("/src/main/resources/Screenshots/" + screenshotName + ".png");
//        FileUtils.copyFile(sourceScreenShot, destinationScreenShot);
//    }

    public static void capturescreenshot(WebDriver driver,String screenshotName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./Screenshot/" + screenshotName + ".png"));
            System.out.println("screenshot taken");
        }catch (Exception e)

        {
            System.out.println("exception while take screenshot"+e.getMessage());
        }
    }
    //C:\Users\Sudhakar\Downloads\QAWorksTest\Next_OnlineShoping\src\main\resources\Screenshots

}
