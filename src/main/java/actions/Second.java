package actions;

import com.sun.org.glassfish.gmbal.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Second {
    private CreateNewsPage createNewsPage;
    private OrderDetailsPage orderDetailsPage;

    @BeforeMethod
    public void signIn() {
        User user = UserRepository.get().temporary();
        orderDetailsPage = loadApplication()
                .signIn()
                .getManualLoginComponent()
                .successfullyLogin(user)
                .navigateMenuUBSCourier();
    }

    @Test(testName = "GC-", description = "GC-")
    @Description("GC-")
    public void addAddress() {
        UserAddress userAddress = new UserAddress(AddAddressPopupLocators.CITY_KIEV,"Sadova", "Kiev", 1, "1", 2);
        //  new AddAddressPopupComponent(driver).inputDistrict(userAddress);
    }

    @AfterMethod
    public void signOut() {
        createNewsPage.signOut();
    }
}
