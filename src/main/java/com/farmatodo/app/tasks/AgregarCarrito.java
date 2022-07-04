package com.farmatodo.app.tasks;

import com.farmatodo.app.userInterface.FarmatodoUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgregarCarrito implements Task {


    FarmatodoUI farmatodoUI = new FarmatodoUI();

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {

            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        actor.attemptsTo(
                Click.on(farmatodoUI.BTN_RECOMENDADO),
                Click.on(farmatodoUI.BTN_AGREGAR),
                Click.on(farmatodoUI.BTN_VOLVER),
                Click.on(farmatodoUI.SELECT_BARRA),
                Enter.keyValues("shampoo").into(farmatodoUI.SELECT_BARRA),
                Click.on(farmatodoUI.SELECT_PRODUCTO),
                Click.on(farmatodoUI.BTN_CARRITO),
                Click.on(farmatodoUI.BTN_ELIMINAR),
                Click.on(farmatodoUI.BTN_ACEPTAR),
                Click.on(farmatodoUI.BTN_REGRESARHOME)
                //Click.on(farmatodoUI.DESCARTAR),
                //Click.on(farmatodoUI.BTN_CATEGORIAS)
                //Click.on(farmatodoUI.SELECT_CATEGORIAS)

        );

    }
    //permite llamar desde afuera las clase
    public static Performable on(){
        return Instrumented.instanceOf(AgregarCarrito.class).withProperties();
    }
    }

