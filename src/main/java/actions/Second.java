package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Second {
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

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
