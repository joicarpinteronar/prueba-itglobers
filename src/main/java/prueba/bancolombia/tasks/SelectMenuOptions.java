package prueba.bancolombia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import prueba.bancolombia.interactions.menu.SelectMenuOption;
import prueba.bancolombia.interactions.waits.WaitFor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static prueba.bancolombia.utils.enums.MenuOptions.INVERSIONES;

public class SelectMenuOptions implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
             SelectMenuOption.named(INVERSIONES.getValue()),
             WaitFor.unTiempo(2000));
    }

    public static SelectMenuOptions selectMenu() {
        return instrumented(SelectMenuOptions.class);
    }
}