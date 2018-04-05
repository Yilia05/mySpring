package myIOC;

import myIOC.factory.AutowireCapableBeanFactory;
import myIOC.factory.BeanFactory;
import org.junit.Test;

/**
 * Created by Yilia on 2018/3/27.
 */
public class BeanFactoryTest {

  @Test
  public void test() {
    // init beanFactory
    BeanFactory beanFactory = new AutowireCapableBeanFactory();

    // set bean
    BeanDefinition beanDefinition = new BeanDefinition();
    beanDefinition.setBeanClassName("myIOC.HelloService");
    beanFactory.registerBeanDefinition("helloService", beanDefinition);

    // get bean
    HelloService helloService = (HelloService) beanFactory.getBean("helloService");
    helloService.helloService();

  }


}
