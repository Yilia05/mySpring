package myIOC.factory;

import myIOC.BeanDefinition;

/**
 * Created by Yilia on 2018/3/27.
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
      try {
        Object bean = beanDefinition.getBeanClass().newInstance();
        return bean;
      } catch (InstantiationException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
      return null;
    }
}
