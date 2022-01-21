package prueba.bancolombia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import prueba.bancolombia.userinterfaces.InversionesPage;

public class ValidacionListaInversiones implements Question<String> {

    public static ValidacionListaInversiones validarInversiones() {
        return new ValidacionListaInversiones();
    }

    @Override
    public String answeredBy(Actor actor) {
        String mensajeInversiones = Text.of(InversionesPage.LBL_INVERSIONES).viewedBy(actor).asString();
        return mensajeInversiones;
    }
}
