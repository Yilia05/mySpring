package myIOC.aop;

import myIOC.HelloService;
import myIOC.context.ApplicationContext;
import myIOC.context.ClasspathXmlApplicationContext;
import org.junit.Test;

/**
 * Created by Yilia on 2018/5/28.
 */
public class JdkDynamicAopProxyTest {
  @Test
  public void testInterceptor() throws Exception {
    // 不使用Aop
    ApplicationContext applicationContext = new ClasspathXmlApplicationContext("myIoc.xml");
    HelloService helloService = (HelloService) applicationContext.getBean("helloService");
    helloService.helloService();

    // 使用Aop
    // 1. 设置被代理对象(Joinpoint)
    AdvisedSupport advisedSupport = new AdvisedSupport();
    TargetSource targetSource = new TargetSource(helloService, HelloService.class);
    advisedSupport.setTargetSource(targetSource);

    // 2. 设置拦截器(Advice)
    TimerInterceptor timerInterceptor = new TimerInterceptor();
    advisedSupport.setMethodInterceptor(timerInterceptor);

    // 3. 创建代理(Proxy)
    JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(advisedSupport);
    HelloService helloServiceProxy = (HelloService) jdkDynamicAopProxy.getProxy();

    // 4. 基于AOP的调用
    helloServiceProxy.helloService();

  }
}
