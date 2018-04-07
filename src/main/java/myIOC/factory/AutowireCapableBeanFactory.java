package myIOC.factory;

import java.lang.reflect.Field;
import myIOC.BeanDefinition;
import myIOC.PropertyValue;

/**
 * Created by Yilia on 2018/3/27.
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

  @Override
  protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
    Object bean = createBeanInstance(beanDefinition);
    applyPropertyValues(bean, beanDefinition);
    return bean;
  }

  protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
    return beanDefinition.getBeanClass().newInstance();
  }

  protected void applyPropertyValues(Object bean, BeanDefinition mbd) throws Exception {
    for (PropertyValue propertyValue : mbd.getPropertyValues().getPropertyValues()) {
      Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
      declaredField.setAccessible(true);
      declaredField.set(bean, propertyValue.getValue());
    }
  }
}
