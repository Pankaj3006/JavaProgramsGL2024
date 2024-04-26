package com.pan.packs.dockerprograms;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class SetupDockerGrid {

    @BeforeTest
    void start_Grid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start start_dockerGrid.bat");
        Thread.sleep(20000);

        Runtime.getRuntime().exec("cmd /c start scale_dockerGrid.bat");
        Thread.sleep(10000);
    }

    @AfterTest
    void stop_Grid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start stop_dockerGrid.bat");
        Thread.sleep(10000);

        Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
    }
}
