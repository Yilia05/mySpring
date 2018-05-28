package myIOC.beans;

/**
 * Created by Yilia on 2018/4/7.
 */
public interface BeanDefinitionReader {
  void loadBeanDefinitions(String location) throws Exception;
}
