package org.example.pageObjects;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class HomePage extends BasePage {

    public WebDriver driver;

    By username = By.cssSelector("input#user-name");
    By password = By.cssSelector("input#password");
    By loginBtn = By.cssSelector("input#login-button");

    public HomePage() throws IOException {
        this.driver = getDriver();
    }

    public WebElement getUsername() {
        return driver.findElement(username);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement getLoginBtn() {
        return driver.findElement(loginBtn);
    }


}
