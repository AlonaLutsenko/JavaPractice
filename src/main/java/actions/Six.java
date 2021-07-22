package actions;

public class Six {
    public void checkStreetMessageInfo() {
        logger.info("Verify that the window will be closed and all the data on the pop-up shall be erased, when the user clicks on the button “Відмінити” on address pop-up menu");
        orderDetailsPage
                .getServicesComponents()
                .get(0)
                .getInput()
                .sendKeys("10");
    }
}
