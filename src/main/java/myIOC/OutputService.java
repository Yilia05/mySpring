package myIOC;

import org.junit.Assert;

/**
 * Created by Yilia on 2018/5/18.
 */
public class OutputService {
  private HelloService helloService;

  public void output(String text){
    Assert.assertNotNull(helloService);
    System.out.println(text);
  }

  public void setHelloService(HelloService helloService) {
    this.helloService = helloService;
  }
}
