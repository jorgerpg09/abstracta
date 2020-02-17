package com.cucumber.stepDefinitions;

import Base.BaseUtil;
import io.cucumber.java.*;

public class Hook extends BaseUtil {

    @Before
    public void Initialize(Scenario scenario){
        System.out.println("Opening browser");
        System.out.println("Running: " + scenario.getName());
        // we could add more before if needed
    }


    @After
    public void TearDown(Scenario scenario){
        if (scenario.isFailed()){
            //take screenshot
        }
        System.out.println("Closing browser");
        webDriver.close();
    }
}
