package myIOC.context;

import myIOC.HelloService;
import org.junit.Test;

/**
 * Created by Yilia on 2018/5/28.
 */
public class ApplicationContextTest {
  @Test
  public void test() throws Exception {
    ApplicationContext applicationContext = new ClasspathXmlApplicationContext("myIoc.xml");
    HelloService helloWorldService = (HelloService) applicationContext.getBean("helloService");
    helloWorldService.helloService();
  }

}
