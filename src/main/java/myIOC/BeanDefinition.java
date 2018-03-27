package myIOC;

/**
 * Created by Yilia on 2018/3/26.
 */
public class BeanDefinition {
  private Object bean;

  public BeanDefinition(Object bean) {
    this.bean = bean;
  }

  public Object getBean() {
    return bean;
  }
}
