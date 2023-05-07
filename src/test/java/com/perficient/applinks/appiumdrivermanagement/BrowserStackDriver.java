package com.perficient.applinks.appiumdrivermanagement;

import com.perficient.applinks.utils.SetCapabilities;
import com.perficient.applinks.utils.URLLocalOrCloud;
import io.appium.java_client.AppiumDriver;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BrowserStackDriver implements DriverSource {
    private static final DesiredCapabilities CAPABILITIES = new DesiredCapabilities();
    private static final boolean ENVIROMENT = System.getProperty("environment").equalsIgnoreCase("local");
    private static AppiumDriver appiumDriverToReturn;
    private static EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    public AppiumDriver newDriver() {
        if (ENVIROMENT)
            SetCapabilities.localCapabilities(CAPABILITIES, environmentVariables);
        else
            SetCapabilities.forBrowserStack(CAPABILITIES, environmentVariables);

        URL enviroment = URLLocalOrCloud.endpoint(ENVIROMENT, environmentVariables);
        appiumDriverToReturn = new AppiumDriver(enviroment, CAPABILITIES) {
        };
        return appiumDriverToReturn;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
