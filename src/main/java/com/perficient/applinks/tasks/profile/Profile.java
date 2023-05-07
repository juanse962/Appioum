package com.perficient.applinks.tasks.profile;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import java.util.List;
import java.util.Map;

import static com.perficient.applinks.ui.ProfileVIew.*;

public class Profile implements Task {

    private final List<Map<String,String>> dataCertificationHobbieAndSkill;

    public Profile(DataTable dataCertificationHobbieAndSkill) {
         this.dataCertificationHobbieAndSkill = dataCertificationHobbieAndSkill.asMaps(String.class,String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PROFILE).afterWaitingUntilPresent(),
                Click.on(CERTIFICATION_ADD),
                Click.on(PROFILE_INPUT),
                SendKeys.of(dataCertificationHobbieAndSkill.get(0).get("certification")).into(PROFILE_INPUT),
                Click.on(ADD_INPUT_VALUE),
                Click.on(HOBBIES_ADD),
                Click.on(PROFILE_INPUT),
                SendKeys.of(dataCertificationHobbieAndSkill.get(0).get("hobbies")).into(PROFILE_INPUT),
                Click.on(ADD_INPUT_VALUE),
                Click.on(SKILLS_ADD),
                Click.on(PROFILE_INPUT),
                SendKeys.of(dataCertificationHobbieAndSkill.get(0).get("skills")).into(PROFILE_INPUT),
                Click.on(ADD_INPUT_VALUE)
        );
    }

    public static Profile addNewRecord(DataTable dataTable) {
        return Tasks.instrumented(Profile.class, dataTable);
    }
}
