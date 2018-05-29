package myIOC.aop;

import myIOC.HelloService;
import myIOC.HelloServiceImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yilia on 2018/5/28.
 */
public class AspectJExpressionPointcutTest {
  @Test
  public void testClassFilter() throws Exception {
    String expression = "execution(* myIOC.*.*(..))";
    AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
    aspectJExpressionPointcut.setExpression(expression);
    boolean matches = aspectJExpressionPointcut.getClassFilter().matches(HelloService.class);
    Assert.assertTrue(matches);
  }

  @Test
  public void testMethodInterceptor() throws Exception {
    String expression = "execution(* myIOC.*.*(..))";
    AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
    aspectJExpressionPointcut.setExpression(expression);
    boolean matches = aspectJExpressionPointcut.getMethodMatcher().matches(HelloServiceImpl.class.getDeclaredMethod("helloService"),HelloServiceImpl.class);
    Assert.assertTrue(matches);
  }
}
