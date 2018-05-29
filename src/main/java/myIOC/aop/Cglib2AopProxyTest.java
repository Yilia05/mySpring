package myIOC.aop;

import myIOC.HelloService;
import myIOC.HelloServiceImpl;
import myIOC.context.ApplicationContext;
import myIOC.context.ClasspathXmlApplicationContext;
import org.junit.Test;

/**
 * Created by Yilia on 2018/5/29.
 */
public class Cglib2AopProxyTest {
  @Test
  public void testInterceptor() throws Exception {
    // --------- helloWorldService without AOP
    ApplicationContext applicationContext = new ClasspathXmlApplicationContext("myIoc.xml");
    HelloService helloService = (HelloService) applicationContext.getBean("helloService");
    helloService.helloService();

    // --------- helloWorldService with AOP
    // 1. 设置被代理对象(Joinpoint)
    AdvisedSupport advisedSupport = new AdvisedSupport();
    TargetSource targetSource = new TargetSource(helloService, HelloServiceImpl.class,
        HelloService.class);
    advisedSupport.setTargetSource(targetSource);

    // 2. 设置拦截器(Advice)
    TimerInterceptor timerInterceptor = new TimerInterceptor();
    advisedSupport.setMethodInterceptor(timerInterceptor);

    // 3. 创建代理(Proxy)
    Cglib2AopProxy cglib2AopProxy = new Cglib2AopProxy(advisedSupport);
    HelloService helloWorldServiceProxy = (HelloService) cglib2AopProxy.getProxy();

    // 4. 基于AOP的调用
    helloWorldServiceProxy.helloService();

  }
}
