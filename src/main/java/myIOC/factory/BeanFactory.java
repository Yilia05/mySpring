package myIOC.factory;

import myIOC.BeanDefinition;

/**
 * Created by Yilia on 2018/3/26.
 */
public interface BeanFactory {

  Object getBean(String name);

  void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
