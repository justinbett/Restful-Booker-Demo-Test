import org.example.base.Hooks;
import org.example.pageObjects.CheckoutPage;
import org.example.pageObjects.HomePage;
import org.example.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(org.example.resources.Listeners.class)
public class CheckoutTest extends Hooks {
    static LoginPage loginPage;
    static HomePage homePage;
    static CheckoutPage checkoutPage;

    static String username = "standard_user";
    static String password = "secret_sauce";

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
        loginPage.getUsername().sendKeys(username);
        loginPage.getPassword().sendKeys(password);
        loginPage.getLoginBtn().click();
        System.out.println("Logged in using:" + username);
    }

    @Test (dependsOnMethods = {"Login"})
    public static void AddItemsToCart() {
        homePage.getAddItem1().click();
        homePage.getAddItem2().click();
        homePage.getAddItem3().click();
    }

    @Test (dependsOnMethods = {"AddItemsToCart"})
    public static void Logout() {
        //Log user out and re-login to check that the items added to the cart are saved.
        homePage.getMenu().click();
        homePage.getLogout().click();
        loginPage.getUsername().sendKeys(username);
        loginPage.getPassword().sendKeys(password);
        loginPage.getLoginBtn().click();
        System.out.println("Logged in using:" + username);
    }

    @Test (dependsOnMethods = {"Logout"})
    public static void Checkout() throws InterruptedException {
        homePage.getShoppingCart().click();
        checkoutPage.getRemoveItem3().click();
        checkoutPage.getCheckoutBtn().click();
        checkoutPage.getFirstName().sendKeys("John");
        checkoutPage.getLastName().sendKeys("Smith");
        checkoutPage.getPostalCode().sendKeys("12345");
        checkoutPage.getContinueBtn().click();
        Assert.assertEquals("Total: $43.18", checkoutPage.getTotal().getText());
        System.out.println(checkoutPage.getTotal().getText());
        checkoutPage.getFinishBtn().click();

        Thread.sleep(5000);
    }

}