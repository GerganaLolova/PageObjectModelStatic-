package adminarea.positive;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.adminarea.AdminLoginPage;

public class AdminDashboardTests extends BaseTest {

    @Test
    public void someDashboardTest() {
        AdminLoginPage.goToAdminLoginPage();
        AdminLoginPage.login("admin", "parola123!");
        //TODO: Complete the test
        //AdminDashboardPage.verifyDashboardTitle("Dashboard");
        //AdminDashboardPage.verifyDashboardHeadingText("Dashboard",
              //  "The heading of the dashboard is different from the expected one.");
    }

}
