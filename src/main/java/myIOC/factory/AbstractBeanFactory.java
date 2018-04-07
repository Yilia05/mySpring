package myIOC.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import myIOC.BeanDefinition;

/**
 * Created by Yilia on 2018/3/27.
 */
public abstract class AbstractBeanFactory implements BeanFactory {

  private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

  @Override
  public Object getBean(String name) {
    return beanDefinitionMap.get(name).getBean();
  }

  @Override
  public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {
    Object bean = doCreateBean(beanDefinition);
    beanDefinition.setBean(bean);
    beanDefinitionMap.put(name, beanDefinition);
  }


  protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;


}
