package myIOC.aop;

/**
 * Created by Yilia on 2018/5/28.
 */
public interface PointcutAdvisor extends Advisor{
  Pointcut getPointcut();
}
