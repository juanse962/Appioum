package com.perficient.applinks.ui;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProfileVIew {
    public static final Target PROFILE = Target.the("Profile section").locatedForAndroid(MobileBy.AccessibilityId("Profile"))
            .locatedForIOS(MobileBy.accessibilityId("ic_profile"));
    public static final Target CERTIFICATION_ADD = Target.the("Certification add button")
            .locatedForAndroid(MobileBy.xpath("(//android.view.View[@content-desc=\"Add ability\"])[1]"))
            .locatedForIOS(MobileBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
    public static Target ADD_INPUT_VALUE = Target.the("Add written in the input")
            .located(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
    public static Target CERTIFICATION_TEXT = Target.the("Getting certification text")
            .located(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.widget.ScrollView[1]/android.widget.EditText[3]"));
    public static final Target HOBBIES_ADD = Target.the("Add button hobbies")
            .locatedForAndroid(AppiumBy.xpath("(//android.view.View[@content-desc=\"Add ability\"])[2]"))
            .locatedForIOS(MobileBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
    public static Target HOBBIES_TEXT = Target.the("Getting hobbies text")
            .located(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.widget.ScrollView[2]/android.widget.EditText[2]"));
    public static Target SKILL_TEXT = Target.the("Getting skill text")
            .located(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.widget.ScrollView[3]/android.widget.EditText[5]"));
    public static Target PROFILE_INPUT = Target.the("Input profile")
            .located(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
    public static final Target SKILLS_ADD = Target.the("Add button skills")
            .locatedForAndroid(AppiumBy.xpath("(//android.view.View[@content-desc=\"Add ability\"])[3]"))
            .locatedForIOS(MobileBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[3]"));

}

