package myIOC.aop;

import java.lang.reflect.Method;

/**
 * Created by Yilia on 2018/5/28.
 */
public interface MethodMatcher {
  boolean matches(Method method, Class targetClass);
}
