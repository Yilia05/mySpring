package myIOC;

import java.util.Map;
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
  public void test() throws Exception {
    // 1. load definition from xml
    XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
    xmlBeanDefinitionReader.loadBeanDefinitions("myIoc.xml");

    // 2.初始化BeanFactory并注册bean
    BeanFactory beanFactory = new AutowireCapableBeanFactory();
    for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
      beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
    }

    // 3.获取bean
    HelloService helloService = (HelloService) beanFactory.getBean("helloService");
    helloService.helloService();

  }

}
