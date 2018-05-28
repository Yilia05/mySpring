package myIOC.context;

import java.util.Map;
import myIOC.beans.BeanDefinition;
import myIOC.beans.factory.AbstractBeanFactory;
import myIOC.beans.factory.AutowireCapableBeanFactory;
import myIOC.beans.io.ResourceLoader;
import myIOC.beans.xml.XmlBeanDefinitionReader;

/**
 * Created by Yilia on 2018/5/28.
 */
public class ClasspathXmlApplicationContext extends AbstractApplicationContext {
  private String configLocation;

  public ClasspathXmlApplicationContext(String configLocation) throws Exception {
    this(configLocation, new AutowireCapableBeanFactory());
  }

  public ClasspathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFactory) throws Exception {
    super(beanFactory);
    this.configLocation = configLocation;
    refresh();
  }

  @Override
  public void refresh() throws Exception {
    XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
    xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
    for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
      beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
    }
  }

}
