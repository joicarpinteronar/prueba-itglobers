package prueba.bancolombia.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InversionesPage extends PageObject {

    public static final Target LBL_INVERSIONES =
            Target.the("Label Inversiones").located(By.xpath("//h1[contains(.,'Inversiones')]"));
    public static final Target LBL_GRUPO_BANCOLOMBIA =
            Target.the("Label Grupo Bancolombia").located(By.xpath("//h6[contains(.,'Grupo Bancolombia')]"));
}

