package myIOC;

/**
 * Created by Yilia on 2018/4/5.
 */
public class PropertyValue {

  private final String name;

  private final Object value;

  public PropertyValue(String name, Object value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public Object getValue() {
    return value;
  }

}
