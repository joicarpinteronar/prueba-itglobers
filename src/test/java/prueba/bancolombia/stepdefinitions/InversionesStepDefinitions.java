package prueba.bancolombia.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import prueba.bancolombia.questions.ValidacionListaInversiones;
import prueba.bancolombia.tasks.Inversiones;
import prueba.bancolombia.tasks.Navegar;
import prueba.bancolombia.tasks.SelectMenuOptions;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static prueba.bancolombia.utils.enums.Constants.MENSAJE_INVERSIONES;


public class InversionesStepDefinitions {

    @Dado("^que un (.*) ingresa al portal de Bancolombia$")
    public void irAlPortal(String actor) {
        theActorCalled(actor).wasAbleTo(Navegar.abrirUrl());
    }

    @Cuando("^ingresa a la opcion de Inversiones$")
    public void irOpcionInversiones() {
        theActorInTheSpotlight().attemptsTo(SelectMenuOptions.selectMenu());
    }

    @Entonces("^se valida que este en la pagina de Inversiones$")
    public void validarPantallaInversiones() {
        theActorInTheSpotlight().should(seeThat(ValidacionListaInversiones.validarInversiones(),equalTo(MENSAJE_INVERSIONES)));
    }

    @Y("^valida la lista de Inversiones$")
    public void validarListaInversiones() {
        theActorInTheSpotlight().attemptsTo(Inversiones.validarLista());
    }
}
