package com.perficient.applinks.tasks;

import io.appium.java_client.remote.HideKeyboardStrategy;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ui.Select;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static com.perficient.applinks.ui.SignInVIew.*;

public class Login implements Task {
    private final List<Map<String,String>> dataCredentials;

    public static Performable loginWithAccount(DataTable dataCredentials) {
        return new Login(dataCredentials);
    }

    public Login(DataTable dataCredentials) {
        this.dataCredentials = dataCredentials.asMaps(String.class,String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN).afterWaitingUntilPresent(),
                Clear.field(EMAIL),
                SendKeys.of(dataCredentials.get(0).get("user")).into(EMAIL),
                Clear.field(PASSWORD),
                (System.getProperty("properties").contains("ios")) ?
                SendKeys.of(dataCredentials.get(0).get("password")).into(PASSWORD).thenHit(Keys.ENTER):
                SendKeys.of(dataCredentials.get(0).get("password")).into(PASSWORD),
                Click.on(SIGN_IN)
        );
    }


}
