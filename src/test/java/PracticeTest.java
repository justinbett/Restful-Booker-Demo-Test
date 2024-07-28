import org.example.base.Hooks;
import org.example.pageObjects.HomePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(org.example.resources.Listeners.class)
public class PracticeTest extends Hooks {

    public PracticeTest() throws IOException {
        super();
    }

    @Test
    public static void HelloWorldTest() {
        System.out.println("Hello World!");
    }

    @Test
    public static void ClickTest() throws IOException {
        HomePage homePage = new HomePage();
        homePage.getBookRoom1().click();
        System.out.println("Book Room 1: Click");
    }

}
