import org.example.base.Hooks;
import org.example.pageObjects.HomePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(org.example.resources.Listeners.class)
public class HelloWorldTest extends Hooks {

    public HelloWorldTest() throws IOException {
        super();
    }

    @Test
    public static void HelloWorldTest1() throws IOException {
        HomePage homePage = new HomePage();

        System.out.println("Hello World!");

        homePage.getBookRoom1().click();

        System.out.println("Book Room 1: Click");
    }

}
