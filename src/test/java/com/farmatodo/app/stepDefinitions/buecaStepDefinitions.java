package com.farmatodo.app.stepDefinitions;

import com.farmatodo.app.driver.AppiumAndroidDriver;
import com.farmatodo.app.tasks.AgregarCarrito;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class buecaStepDefinitions {

    @Before
    public void before() throws IOException{
        OnStage.setTheStage(new OnlineCast());

    }
    @Given("^que el usuario se encuentra en la app farmatodo$")
    public void queElUsuarioSeEncuentraEnLaAppFarmatodo() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.appium().on()));

    }


    @When("^desee agregar elementos al carrito$")
    public void deseeAgregarElementosAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarCarrito.on());

    }

    @Then("^usara la barra de busqueda para encontrar el contenido deseado$")
    public void usaraLaBarraDeBusquedaParaEncontrarElContenidoDeseado() {

    }
}
