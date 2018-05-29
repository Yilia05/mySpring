package myIOC.aop;

/**
 * Created by Yilia on 2018/5/29.
 */
public abstract class AbstractAopProxy implements AopProxy {

  protected AdvisedSupport advised;

  public AbstractAopProxy(AdvisedSupport advised) {
    this.advised = advised;
  }
}
