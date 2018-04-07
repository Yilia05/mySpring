package myIOC;

import myIOC.factory.AutowireCapableBeanFactory;
import myIOC.factory.BeanFactory;
import org.junit.Test;

/**
 * Created by Yilia on 2018/3/27.
 */
public class BeanFactoryTest {

  @Test
  public void test() throws Exception {
    // init beanFactory
    BeanFactory beanFactory = new AutowireCapableBeanFactory();

    // set bean definition
    BeanDefinition beanDefinition = new BeanDefinition();
    beanDefinition.setBeanClassName("myIOC.HelloService");

    // set property
    PropertyValues propertyValues = new PropertyValues();
    propertyValues.addPropertyValue(new PropertyValue("text", "Hello World"));
    beanDefinition.setPropertyValues(propertyValues);

    // init bean
    beanFactory.registerBeanDefinition("helloService", beanDefinition);

    // get bean
    HelloService helloService = (HelloService) beanFactory.getBean("helloService");
    helloService.helloService();

  }


}
