package com.perficient.applinks.questions;

import com.perficient.applinks.ui.ConnectView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConnectQuestion implements Question {

    private String title;

    public ConnectQuestion (String title){
        this.title = title;
    }

    public static ConnectQuestion valuesInConnect(String title){
        return new ConnectQuestion(title);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String pageTitle = ConnectView.TITLE.resolveFor(actor).getText();

        return pageTitle.equals(title) && ConnectView.BIRTHDAYS_TODAY.resolveFor(actor).isPresent();
    }
}
