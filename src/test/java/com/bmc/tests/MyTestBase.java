package com.bmc.tests;

import com.bmc.fw.ApplicationManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

/**
 * Created by energetic on 22.06.2016.
 */
public class MyTestBase {
    protected ApplicationManager app;

    @BeforeClass
    public void setUp() throws InterruptedException {
        app = ApplicationManager.getInstanse();
        app.init();
    }
    @AfterTest
    public void tearDown(){
        app.dismiss();
    }
}
