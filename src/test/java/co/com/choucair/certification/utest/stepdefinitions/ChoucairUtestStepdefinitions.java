package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.models.*;
import co.com.choucair.certification.utest.questions.Answer;
import co.com.choucair.certification.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairUtestStepdefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that Jose is on uTest home page$")
    public void thatJoseIsOnUtestHomePage() {
        OnStage.theActorCalled("Jose").wasAbleTo(OpenUp.thePage());
    }

    @When("^he registers his personal data in Utest$")
    public void heRegistersHisPersonalDataInUtest(List<UtestRegisterData> utestRegisterData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.thePersonalData(utestRegisterData.get(0).getFirstName(),
                utestRegisterData.get(0).getLastName(),
                utestRegisterData.get(0).getEmail(),
                utestRegisterData.get(0).getMonth(),
                utestRegisterData.get(0).getDay(),
                utestRegisterData.get(0).getYear(),
                utestRegisterData.get(0).getLanguages()));
    }

    @When("^he adds the address$")
    public void heAddsTheAddress(List<UtestAddAddressData> utestAddAddressData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Add.theAddress(utestAddAddressData.get(0).getCity(),
                utestAddAddressData.get(0).getCountry(),
                utestAddAddressData.get(0).getPostal()));
    }

    @When("^he chooses his computer and mobile devices$")
    public void heChoosesHisComputerAndMobileDevices(List<UtestChooseDeviceData> utestChooseDeviceData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Choose.theDevices(utestChooseDeviceData.get(0).getComputer(),
                utestChooseDeviceData.get(0).getVersion(),
                utestChooseDeviceData.get(0).getLanguage(),
                utestChooseDeviceData.get(0).getMovileDevice(),
                utestChooseDeviceData.get(0).getModel(),
                utestChooseDeviceData.get(0).getOperatingSystem()));
    }

    @When("^he creates his password$")
    public void heCreatesHisPassword(List<UtestCreatePasswordData> utestCreatePasswordData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Create.thePassword(utestCreatePasswordData.get(0).getPassword()));
    }

    @Then("^user receives confirmation message$")
    public void userReceivesConfirmationMessage(List<UtestAnswerData> utestAnswerData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestAnswerData.get(0).getMessage())));
    }

}
