import org.example.base.Hooks;
import org.example.pageObjects.HomePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(org.example.resources.Listeners.class)
public class PracticeTest extends Hooks {
    static HomePage homePage;

    static {
        try {
            homePage = new HomePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PracticeTest() throws IOException {
        super();
    }

    @Test
    public static void Login() {
        homePage.getUsername().sendKeys("standard_user");
        homePage.getPassword().sendKeys("secret_sauce");
        homePage.getLoginBtn().click();
        System.out.println("Logged In");
    }

    @Test (dependsOnMethods = {"Login"})
    public static void AddToCart() {
        System.out.println("Add items to cart");
    }
}
