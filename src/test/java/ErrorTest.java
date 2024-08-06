import org.example.base.Hooks;
import org.example.pageObjects.CheckoutPage;
import org.example.pageObjects.HomePage;
import org.example.pageObjects.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(org.example.resources.Listeners.class)
public class ErrorTest extends Hooks {
    static LoginPage loginPage;
    static HomePage homePage;
    static CheckoutPage checkoutPage;

    static String username = "problem_user";
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

    public ErrorTest() throws IOException {
        super();
    }

    @Test
    public static void Login() {
        loginPage.getUsername().sendKeys(username);
        loginPage.getPassword().sendKeys(password);
        loginPage.getLoginBtn().click();
        System.out.println("Logged in using:" + username);
    }
    
}
