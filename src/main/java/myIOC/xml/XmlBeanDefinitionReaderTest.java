package myIOC.xml;

import java.util.Map;
import myIOC.BeanDefinition;
import myIOC.io.ResourceLoader;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yilia on 2018/4/7.
 */
public class XmlBeanDefinitionReaderTest {
  @Test
  public void test() throws Exception {
    XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
    xmlBeanDefinitionReader.loadBeanDefinitions("myIoc.xml");
    Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
    Assert.assertTrue(registry.size() > 0);
  }
}
