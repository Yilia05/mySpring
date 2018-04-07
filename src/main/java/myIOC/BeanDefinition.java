package myIOC;

/**
 * Created by Yilia on 2018/3/26.
 */
public class BeanDefinition {

  private Object bean;
  private Class beanClass;
  private String beanClassName;
  private PropertyValues propertyValues;

  public BeanDefinition() {
  }

  public void setBean(Object bean) {
    this.bean = bean;
  }

  public Object getBean() {
    return bean;
  }

  public void setBeanClass(Class beanClass) {
    this.beanClass = beanClass;
  }

  public Class getBeanClass() {
    return beanClass;
  }

  public void setBeanClassName(String beanClassName) {
    this.beanClassName = beanClassName;
    try {
      this.beanClass = Class.forName(beanClassName);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public String getBeanClassName() {
    return beanClassName;
  }

  public PropertyValues getPropertyValues() {
    return propertyValues;
  }

  public void setPropertyValues(PropertyValues propertyValues) {
    this.propertyValues = propertyValues;
  }

}
