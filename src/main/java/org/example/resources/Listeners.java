package org.example.resources;

import org.example.base.BasePage;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends BasePage implements ITestListener {

    public Listeners() throws IOException {
        super();
    }

    public void onTestFailiure(ITestResult result) {
        // Not Implemented
        try {
            takeSnapShot(result.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
