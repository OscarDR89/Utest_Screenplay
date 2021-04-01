package utepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.UtestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.JoinToday;
import tasks.OpenUp;
import tasks.loginUtest;

import java.util.List;

public class utestStepDefenitions {

    @Before
    public void  SetStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    //OnStage.theActorCalled("oscar").wasAbleTo(OpenUp.thePage());

    @Dado("^que estoy en la pagina utest relleno todo los formularios$")
    public void que_estoy_en_la_pagina_utest_relleno_todo_los_formularios(List<UtestData> UtestData) {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        OnStage.theActorCalled("oscar").wasAbleTo(OpenUp.thePage(),JoinToday.onThePage());
    }

    @Cuando("^esperar que llege el corro de confirmacion$")
    public void esperar_que_llege_el_corro_de_confirmacion(List<UtestData> UtestData) {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        OnStage.theActorCalled("oscar").wasAbleTo(OpenUp.thePage(),
                loginUtest.onThePage(UtestData.get(0).getNombresUsuario(),
                UtestData.get(0).getContraseñaInicio()));
    }

    @Entonces("^si ya verificamos la cuenta ingresamos$")
    public void si_ya_verificamos_la_cuenta_ingresamos() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("question")));
    }
}
