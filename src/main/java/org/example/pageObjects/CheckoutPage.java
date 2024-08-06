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
    By removeItem3 = By.cssSelector("button#remove-sauce-labs-bolt-t-shirt");
    By firstName = By.cssSelector("input#first-name");
    By lastName = By.cssSelector("input#last-name");
    By postalCode = By.cssSelector("input#postal-code");
    By continueBtn = By.cssSelector("input#continue");
    By cancelBtn = By.cssSelector("button#cancel");
    By total = By.cssSelector(".summary_total_label");
    By finishBtn = By.cssSelector("button#finish");

    public WebElement getCheckoutBtn() {
        return driver.findElement(checkoutBtn);
    }

    public WebElement getRemoveItem3() {
        return driver.findElement(removeItem3);
    }

    public WebElement getFirstName() {
        return driver.findElement(firstName);
    }

    public WebElement getLastName() {
        return driver.findElement(lastName);
    }

    public WebElement getPostalCode() {
        return driver.findElement(postalCode);
    }

    public WebElement getContinueBtn() {
        return driver.findElement(continueBtn);
    }

    public WebElement getCancelBtn() {
        return driver.findElement(cancelBtn);
    }

    public WebElement getTotal() {
        return driver.findElement(total);
    }

    public WebElement getFinishBtn() {
        return driver.findElement(finishBtn);
    }

}
