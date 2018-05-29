package myIOC.aop;

/**
 * Created by Yilia on 2018/5/28.
 */
public class TargetSource {
  private Class<?> targetClass;

  private Class<?>[] interfaces;

  private Object target;

  public TargetSource(Object target, Class<?> targetClass, Class<?>... interfaces) {
    this.target = target;
    this.targetClass = targetClass;
    this.interfaces = interfaces;
  }

  public Class<?> getTargetClass() {
    return targetClass;
  }

  public Object getTarget() {
    return target;
  }

  public Class<?>[] getInterfaces() {
    return interfaces;
  }
}
