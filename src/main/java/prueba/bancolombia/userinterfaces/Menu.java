package prueba.bancolombia.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class Menu {

  public static final Target MENU_BUTTON =
      Target.the("Opcion Productos y Servicios").located(By.id("menu-productos"));
  public static final Target MENU_OPTION =
      Target.the("Opcion de Inversiones").locatedBy("//li[3]/div/div/div/div[2]/ul/li[2]/a[text()='{0}']");
  public static final Target SUBMENU_OPTION =
      Target.the("Opcion Sucursal Virtual Personas").locatedBy("//*[@id='header-canales-svp']");

  private Menu() {}
}
