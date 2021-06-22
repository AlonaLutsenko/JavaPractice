package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String webDriverPath = System.getenv("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
            Thread.sleep(2000);

            WebElement element1 = driver.findElement(By.id("draggable"));
            WebElement element2 = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);
            actions.moveToElement(element1).clickAndHold().moveToElement(element2).release().perform();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }

    }
}
