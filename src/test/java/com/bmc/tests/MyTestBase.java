package com.bmc.tests;

import com.bmc.fw.ApplicationManager;
import com.bmc.fw.ClientWithResponseHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.io.IOException;


public class MyTestBase {
    protected ApplicationManager app;

    @BeforeClass
    public void setUp() throws InterruptedException, IOException {
        app = ApplicationManager.getInstanse();
        app.init();
        ClientWithResponseHandler.httpResponce();
        System.out.println("*****************");
    }
    @AfterTest
    public void tearDown(){
        app.dismiss();
    }
}
