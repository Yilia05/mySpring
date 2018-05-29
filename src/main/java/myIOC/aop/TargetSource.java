package myIOC.aop;

/**
 * Created by Yilia on 2018/5/28.
 */
public class TargetSource {
  private Class<?>[] targetClass;

  private Object target;

  public TargetSource(Object target, Class<?>[] targetClass) {
    this.target = target;
    this.targetClass = targetClass;
  }

  public Class<?>[] getTargetClass() {
    return targetClass;
  }

  public Object getTarget() {
    return target;
  }

}
