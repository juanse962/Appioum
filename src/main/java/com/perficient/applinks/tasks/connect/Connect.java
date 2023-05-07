package com.perficient.applinks.tasks.connect;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.perficient.applinks.ui.ConnectView.CONNECT;


public class Connect implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONNECT).afterWaitingUntilPresent()
        );
    }

    public static Connect clickConnect() {
        return Tasks.instrumented(Connect.class);
    }
}
