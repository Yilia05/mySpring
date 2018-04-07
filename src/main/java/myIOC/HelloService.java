package myIOC;

/**
 * Created by Yilia on 2018/3/27.
 */
public class HelloService {

  private String text;

  public void helloService() {
    System.out.println(text);
  }

  public void setTest(String text) {
    this.text = text;
  }

}
