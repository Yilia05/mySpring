package myIOC;

import myIOC.OutputService;

/**
 * Created by Yilia on 2018/5/29.
 */
public class OutputServiceImpl implements OutputService{
  @Override
  public void output(String text){
    System.out.println(text);
  }

}
