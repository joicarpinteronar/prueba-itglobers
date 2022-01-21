package prueba.bancolombia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import prueba.bancolombia.interactions.waits.WaitFor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static prueba.bancolombia.userinterfaces.InversionesPage.LBL_GRUPO_BANCOLOMBIA;


public class Inversiones implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LBL_GRUPO_BANCOLOMBIA),
                WaitFor.unTiempo(2000));
    }

    public static Inversiones validarLista() {
        return instrumented(Inversiones.class);
    }
}
