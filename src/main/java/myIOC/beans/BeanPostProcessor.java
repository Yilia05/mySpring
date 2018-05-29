package myIOC.beans;

/**
 * Created by Yilia on 2018/5/28.
 */
public interface BeanPostProcessor {

  Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception;

  Object postProcessAfterInitialization(Object bean, String beanName) throws Exception;

}
