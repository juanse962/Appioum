package com.perficient.applinks.tasks.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.perficient.applinks.ui.HomeVIew.ANOUNCEMENT;
import static com.perficient.applinks.ui.HomeVIew.TITLE;

public class Home implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String title = TITLE.resolveFor(actor).getText();
        actor.attemptsTo(
                Click.on(ANOUNCEMENT),
                Ensure.that(title).matches("([A-Za-z]+( [A-Za-z]+)+)")
        );
    }

    public static Home addNewRecord() {
        return Tasks.instrumented(Home.class);
    }
}
