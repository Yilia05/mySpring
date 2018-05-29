package myIOC.aop;

/**
 * Created by Yilia on 2018/5/29.
 */
public class ProxyFactory extends AdvisedSupport implements AopProxy {
  @Override
  public Object getProxy() {
    return createAopProxy().getProxy();
  }

  protected final AopProxy createAopProxy() {
    return new Cglib2AopProxy(this);
  }


}
