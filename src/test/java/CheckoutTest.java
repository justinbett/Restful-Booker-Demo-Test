import org.example.base.Hooks;
import org.example.pageObjects.CheckoutPage;
import org.example.pageObjects.HomePage;
import org.example.pageObjects.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(org.example.resources.Listeners.class)
public class CheckoutTest extends Hooks {
    static LoginPage loginPage;
    static HomePage homePage;
    static CheckoutPage checkoutPage;

    static String standardUser = "standard_user";
    static String userPassword = "secret_sauce";

    static {
        try {
            loginPage = new LoginPage();
            homePage = new HomePage();
            checkoutPage = new CheckoutPage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public CheckoutTest() throws IOException {
        super();
    }

    @Test
    public static void Login() {
        loginPage.getUsername().sendKeys(standardUser);
        loginPage.getPassword().sendKeys(userPassword);
        loginPage.getLoginBtn().click();
        System.out.println("Logged in using:" + standardUser);
    }

    @Test (dependsOnMethods = {"Login"})
    public static void AddItemsToCart() {
        homePage.getAddItem1().click();
        homePage.getAddItem2().click();
        homePage.getAddItem3().click();
        homePage.getShoppingCart().click();
    }

    @Test (dependsOnMethods = {"AddItemsToCart"})
    public static void Checkout() throws InterruptedException {
        checkoutPage.getCheckoutBtn().click();

        Thread.sleep(5000);
    }
}
