package org.example.pageObjects;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class HomePage extends BasePage {

    public WebDriver driver;

    By bookRoom1 = By.cssSelector("div:nth-of-type(4) > div > .hotel-room-info.row  .btn.btn-outline-primary.float-right");

    public HomePage() throws IOException {
        this.driver = getDriver();
    }

    public WebElement getBookRoom1() {
        return driver.findElement(bookRoom1);
    }
}
