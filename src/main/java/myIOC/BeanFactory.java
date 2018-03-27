package myIOC;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Yilia on 2018/3/26.
 */
public class BeanFactory {
  private Map<String, BeanDefinition> beanMap = new ConcurrentHashMap<String, BeanDefinition>();

  public Object getBean(String name) {
    return beanMap.get(name).getBean();
  }

  public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
    beanMap.put(name, beanDefinition);
  }
}
