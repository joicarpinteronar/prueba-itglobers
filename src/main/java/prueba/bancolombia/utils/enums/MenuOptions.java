package prueba.bancolombia.utils.enums;

public enum MenuOptions {
  INVERSIONES("Inversiones");
  private final String value;

  MenuOptions(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
