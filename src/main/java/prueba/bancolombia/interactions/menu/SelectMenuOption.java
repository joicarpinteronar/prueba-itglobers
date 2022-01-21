package prueba.bancolombia.interactions.menu;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import prueba.bancolombia.interactions.waits.WaitFor;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static prueba.bancolombia.userinterfaces.Menu.MENU_BUTTON;
import static prueba.bancolombia.userinterfaces.Menu.MENU_OPTION;

public class SelectMenuOption implements Interaction {

  private final String menuOption;
  private String submenuOption;

  public SelectMenuOption(String menuOption) {
    this.menuOption = menuOption;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(MENU_BUTTON, isPresent()),
        Click.on(MENU_BUTTON),
        Click.on(MENU_OPTION.of(menuOption)),
        WaitFor.unTiempo(1000)
    );
  }

  public static SelectMenuOption named(String menuOption) {
    return instrumented(SelectMenuOption.class, menuOption);
  }

  public SelectMenuOption andSubmenu(String submenuOption) {
    this.submenuOption = submenuOption;
    return this;
  }
}
