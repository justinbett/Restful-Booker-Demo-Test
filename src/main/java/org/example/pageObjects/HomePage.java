package org.example.pageObjects;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class HomePage extends BasePage {

    public WebDriver driver;

    public HomePage() throws IOException {
        this.driver = getDriver();
    }

    By menu = By.cssSelector("button#react-burger-menu-btn");
    By logout = By.cssSelector("a#logout_sidebar_link");
    By addItem1 = By.cssSelector("button#add-to-cart-sauce-labs-backpack");
    By addItem2 = By.cssSelector("button#add-to-cart-sauce-labs-bike-light");
    By addItem3 = By.cssSelector("button#add-to-cart-sauce-labs-bolt-t-shirt");
    By shoppingCart = By.cssSelector("div#shopping_cart_container > .shopping_cart_link");

    public WebElement getMenu() {
        return driver.findElement(menu);
    }

    public WebElement getLogout() {
        return driver.findElement(logout);
    }

    public WebElement getAddItem1() {
        return driver.findElement(addItem1);
    }

    public WebElement getAddItem2() {
        return driver.findElement(addItem2);
    }

    public WebElement getAddItem3() {
        return driver.findElement(addItem3);
    }

    public WebElement getShoppingCart() {
        return driver.findElement(shoppingCart);
    }



}
