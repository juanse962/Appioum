package com.perficient.applinks.utils;

import net.thucydides.core.util.EnvironmentVariables;

import java.net.MalformedURLException;
import java.net.URL;

public class URLLocalOrCloud {
    private static URL envURL;

    public static URL endpoint(Boolean ENVIROMENT, EnvironmentVariables environmentVariables) {
        try {
            if (ENVIROMENT)
                envURL = new java.net.URL(environmentVariables.getProperty("appium.hub"));
            else
                envURL = new java.net.URL("https://" + System.getenv("BROWSERSTACK_USERNAME") + ":" +
                        System.getenv("BROWSERSTACK_ACCESS_KEY") + "@hub-cloud.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            System.out.println(e);
        }
            return envURL;


    }
}
