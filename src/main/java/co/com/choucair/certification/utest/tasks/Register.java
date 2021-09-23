package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterfaces.UtestRegisterPersonalDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;

import org.openqa.selenium.Keys;

public class Register implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;
    private String languages;

    public Register(String firstName, String lastName, String email, String month, String day, String year, String languages) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.languages = languages;
    }


    public static Performable thePersonalData(String firstName, String lastName, String email, String month, String day, String year, String languages) {
        return Tasks.instrumented(Register.class, firstName, lastName, email, month, day, year, languages);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(UtestRegisterPersonalDataPage.JOIN_BUTTON),
                Enter.theValue(firstName).into(UtestRegisterPersonalDataPage.INPUT_FIRST_NAME),
                Enter.theValue(lastName).into(UtestRegisterPersonalDataPage.INPUT_LAST_NAME),
                Enter.theValue(email).into(UtestRegisterPersonalDataPage.INPUT_MAIL),
                SelectFromOptions.byVisibleText(month).from(UtestRegisterPersonalDataPage.SELECT_MONTH_BIRTH),
                SelectFromOptions.byVisibleText(day).from(UtestRegisterPersonalDataPage.SELECT_DAY_BIRTH),
                SelectFromOptions.byVisibleText(year).from(UtestRegisterPersonalDataPage.SELECT_YEAR_BIRTH),
                Click.on(UtestRegisterPersonalDataPage.INPUT_LANGUAGES),
                Enter.theValue(languages).into(UtestRegisterPersonalDataPage.INPUT_LANGUAGES).thenHit(Keys.ENTER),
                Click.on(UtestRegisterPersonalDataPage.NEXT_BUTTON));
    }
}
