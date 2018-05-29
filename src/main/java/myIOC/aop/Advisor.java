package myIOC.aop;

import org.aopalliance.aop.Advice;

/**
 * Created by Yilia on 2018/5/28.
 */
public interface Advisor {
  Advice getAdvice();
}
