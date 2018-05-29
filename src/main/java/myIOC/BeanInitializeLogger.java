package myIOC;

import myIOC.beans.BeanPostProcessor;

/**
 * Created by Yilia on 2018/5/28.
 */
public class BeanInitializeLogger implements BeanPostProcessor {
  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception {
    System.out.println("Initialize bean " + beanName + " start!");
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws Exception {
    System.out.println("Initialize bean " + beanName + " end!");
    return bean;
  }

}
