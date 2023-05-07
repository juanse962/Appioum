package com.perficient.applinks.utils;

import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SetCapabilities {
    public static void forBrowserStack(DesiredCapabilities capabilities, EnvironmentVariables environmentVariables) {
        capabilities.setCapability("platformName", environmentVariables.getProperty("browserstack.platformName"));
        capabilities.setCapability("platformVersion", environmentVariables.getProperty("browserstack.platformVersion"));
        capabilities.setCapability("deviceName", environmentVariables.getProperty("browserstack.deviceName"));
        capabilities.setCapability("app", environmentVariables.getProperty("browserstack.app"));
        capabilities.setCapability("automationName", environmentVariables.getProperty("browserstack.automationName"));
    }
    public static void localCapabilities(DesiredCapabilities capabilities, EnvironmentVariables environmentVariables) {
        capabilities.setCapability("platformName", environmentVariables.getProperty("appium.platformName"));
        capabilities.setCapability("platformVersion", environmentVariables.getProperty("appium.platformVersion"));
        capabilities.setCapability("deviceName", environmentVariables.getProperty("appium.deviceName"));
        capabilities.setCapability("app", environmentVariables.getProperty("appium.app"));
        capabilities.setCapability("automationName", environmentVariables.getProperty("appium.automationName"));
    }
}
