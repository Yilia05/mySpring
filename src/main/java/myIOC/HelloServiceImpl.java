package myIOC;

/**
 * Created by Yilia on 2018/5/28.
 */
public class HelloServiceImpl implements HelloService {
  private String text;

  private OutputService outputService;

  @Override
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
