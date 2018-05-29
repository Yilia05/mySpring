package myIOC.aop;

import myIOC.beans.factory.BeanFactory;

/**
 * Created by Yilia on 2018/5/29.
 */
public interface BeanFactoryAware {

  void setBeanFactory(BeanFactory beanFactory) throws Exception;

}
