package com.perficient.applinks.ui;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ConnectView {
    public static final Target CONNECT = Target.the("Connect section").locatedForAndroid(MobileBy.AccessibilityId("Connect"))
            .locatedForIOS(MobileBy.accessibilityId("ic_connect"));

    public static final Target SEARCH_BAR = Target.the("Connect search bar").located(AppiumBy.accessibilityId("Search user"));

    public static final Target CLEAR_SEARCH = Target.the("Clear search bar").located(AppiumBy.accessibilityId("Clear search"));

    public static final Target TITLE = Target.the("Connect title").located(AppiumBy.xpath("//android.widget.TextView[@text='Connect']"));

    public static final Target BIRTHDAYS_TODAY = Target.the("Connect list of birthdays").located(AppiumBy.xpath("//android.widget.TextView[@text='Happy Birthday!']"));
}
