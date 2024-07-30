package org.example.pageObjects;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class CheckoutPage extends BasePage {

    public WebDriver driver;

    public CheckoutPage() throws IOException {
        this.driver = getDriver();
    }

    By checkoutBtn = By.cssSelector("button#checkout");

    public WebElement getCheckoutBtn() {
        return driver.findElement(checkoutBtn);
    }

}
