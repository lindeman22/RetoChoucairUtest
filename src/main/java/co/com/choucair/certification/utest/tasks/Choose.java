package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterfaces.UtestChooseTheDevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.Keys;


public class Choose implements Task {

    private String computer;
    private String version;
    private String language;
    private String movileDevice;
    private String model;
    private String operatingSystem;

    public Choose(String computer, String version, String language, String movileDevice, String model, String operatingSystem) {
        this.computer = computer;
        this.version = version;
        this.language = language;
        this.movileDevice = movileDevice;
        this.model = model;
        this.operatingSystem = operatingSystem;
    }

    public static Performable theDevices(String computer, String version, String language, String movileDevice,
                                         String model, String operatingSystem) {
        return Tasks.instrumented(Choose.class, computer, version, language, movileDevice, model, operatingSystem);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(UtestChooseTheDevicesPage.SELECT_COMPUTER),
                Enter.theValue(computer).into(UtestChooseTheDevicesPage.INPUT_COMPUTER).thenHit(Keys.ENTER),

                Click.on(UtestChooseTheDevicesPage.SELECT_VERSION),
                Enter.theValue(version).into(UtestChooseTheDevicesPage.INPUT_VERSION).thenHit(Keys.ENTER),

                Click.on(UtestChooseTheDevicesPage.SELECT_LANGUAGE),
                Enter.theValue(language).into(UtestChooseTheDevicesPage.INPUT_LANGUAGE).thenHit(Keys.ENTER),

                Click.on(UtestChooseTheDevicesPage.SELECT_MOBILE),
                Enter.theValue(movileDevice).into(UtestChooseTheDevicesPage.INPUT_MOBILE).thenHit(Keys.ENTER),

                Click.on(UtestChooseTheDevicesPage.SELECT_MODEL),
                Enter.theValue(model).into(UtestChooseTheDevicesPage.INPUT_MODEL).thenHit(Keys.ENTER),

                Click.on(UtestChooseTheDevicesPage.SELECT_OPERATING_SYSTEM),
                Enter.theValue(operatingSystem).into(UtestChooseTheDevicesPage.INPUT_OPERATING_SYSTEM).thenHit(Keys.ENTER),

                Click.on(UtestChooseTheDevicesPage.NEXT_LAST_STEP)
        );
    }
}