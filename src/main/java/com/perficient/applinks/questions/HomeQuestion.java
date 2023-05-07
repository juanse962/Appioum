package com.perficient.applinks.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.perficient.applinks.ui.HomeVIew.COMPONENT;

public class HomeQuestion implements Question {

    public static HomeQuestion valuesInProfile() {
        return new HomeQuestion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return COMPONENT.resolveFor(actor).isPresent();
    }


}
