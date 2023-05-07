package com.perficient.applinks.ui;


import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class SignInVIew {

    public static final Target LOGIN = Target.the("Login button").locatedForAndroid(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.widget.Button"))
            .locatedForIOS(MobileBy.accessibilityId("Login"));

    public static final Target EMAIL = Target.the("Username").locatedForAndroid(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.widget.EditText[1]"))
            .locatedForIOS(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`name == \"input.login\"`]"));
    public static final Target PASSWORD = Target.the("Password").locatedForAndroid(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.widget.EditText[2]"))
            .locatedForIOS(MobileBy.xpath("//XCUIElementTypeApplication[@name=\"Perficient Links Dev\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
    public static final Target SIGN_IN = Target.the("Sigin in").locatedForAndroid(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"))
            .locatedForIOS(MobileBy.accessibilityId("signin"));
}

