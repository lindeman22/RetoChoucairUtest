package co.com.choucair.certification.utest.questions;

import co.com.choucair.certification.utest.userinterfaces.UtestAnswerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;


    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override

    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String textWelcome = Text.of(UtestAnswerPage.TEXT_MESSAGE).viewedBy(actor).asString();
        if (question.equals(textWelcome)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}


