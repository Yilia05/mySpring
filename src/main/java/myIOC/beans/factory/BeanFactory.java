package myIOC.beans.factory;

import myIOC.beans.BeanDefinition;

/**
 * Created by Yilia on 2018/3/26.
 */
public interface BeanFactory {

  Object getBean(String name) throws Exception;

}
