package myIOC.aop;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Yilia on 2018/5/28.
 */
public class ReflectiveMethodInvocation implements MethodInvocation{
  private Object target;
  private Method method;
  private Object[] args;

  public ReflectiveMethodInvocation(Object target, Method method, Object[] args) {
    this.target = target;
    this.method = method;
    this.args = args;
  }

  @Override
  public Method getMethod() {
    return method;
  }

  @Override
  public Object[] getArguments() {
    return args;
  }

  @Override
  public Object getThis() {
    return target;
  }

  @Override
  public AccessibleObject getStaticPart() {
    return method;
  }

  @Override
  public Object proceed() throws Throwable {
    return method.invoke(target, args);
  }
}
