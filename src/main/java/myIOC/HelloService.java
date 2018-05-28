package myIOC;

/**
 * Created by Yilia on 2018/3/27.
 */
public class HelloService {

  private String text;

  private OutputService outputService;

  public void helloService() {
    outputService.output(text);
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setOutputService(OutputService outputService) {
    this.outputService = outputService;
  }

}
