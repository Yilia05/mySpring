package myIOC;

import java.util.Map;
import myIOC.factory.AbstractBeanFactory;
import myIOC.factory.AutowireCapableBeanFactory;
import myIOC.factory.BeanFactory;
import myIOC.io.ResourceLoader;
import myIOC.xml.XmlBeanDefinitionReader;
import org.junit.Test;

/**
 * Created by Yilia on 2018/3/27.
 */
public class BeanFactoryTest {

  @Test
  public void testLazyInit() throws Exception {
    // 1. load definition from xml
    XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
    xmlBeanDefinitionReader.loadBeanDefinitions("myIoc.xml");

    // 2.初始化BeanFactory并注册bean
    AbstractBeanFactory beanFactory = new AutowireCapableBeanFactory();
    for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
      beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
    }

    // 3.获取bean
    HelloService helloService = (HelloService) beanFactory.getBean("helloService");
    helloService.helloService();

  }

  @Test
  public void testPreInstantiate() throws Exception {
    // 1.读取配置
    XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
    xmlBeanDefinitionReader.loadBeanDefinitions("myIoc.xml");

    // 2.初始化BeanFactory并注册bean
    AbstractBeanFactory beanFactory = new AutowireCapableBeanFactory();
    for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
      beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
    }

    // 3.初始化bean
    beanFactory.preInstantiateSingletons();

    // 4.获取bean
    HelloService helloService = (HelloService) beanFactory.getBean("helloService");
    helloService.helloService();
  }

}
