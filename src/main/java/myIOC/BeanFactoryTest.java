package myIOC;

import org.junit.Test;

/**
 * Created by Yilia on 2018/3/27.
 */
public class BeanFactoryTest {

  @Test
  public void test() {
    String name = "helloService";
    BeanFactory beanFactory = new BeanFactory();

    BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
    beanFactory.registerBeanDefinition(name, beanDefinition);

    HelloService helloService = (HelloService) beanFactory.getBean(name);

  }


}
