package com.perficient.applinks.questions;

import static com.perficient.applinks.ui.ProfileVIew.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class CertificationsHobbiesSkillsQuestion implements Question {

    private final String questionCert;
    private final String questionHobbies;
    private final String questionSkill;

    public CertificationsHobbiesSkillsQuestion(String questionCert, String questionHobbies, String questionSkill) {
        this.questionCert = questionCert;
        this.questionHobbies = questionHobbies;
        this.questionSkill = questionSkill;
    }

    public static CertificationsHobbiesSkillsQuestion valuesInProfile(String questionCert, String questionHobbie, String questionSkill) {
        return new CertificationsHobbiesSkillsQuestion(questionCert, questionHobbie, questionSkill);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String certificationText = CERTIFICATION_TEXT.resolveFor(actor).getText();
        String hobbiesText = HOBBIES_TEXT.resolveFor(actor).getText();
        String skillText = SKILL_TEXT.resolveFor(actor).getText();

        return certificationText.equals(questionCert) && hobbiesText.equals(questionHobbies)
                && skillText.equals(questionSkill);
    }


}
