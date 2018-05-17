package myIOC.io;

import java.net.URL;

/**
 * Created by Yilia on 2018/4/7.
 */
public class ResourceLoader {

  public Resource getResource(String location){
    URL resource = this.getClass().getClassLoader().getResource(location);
    return new UrlResource(resource);
  }
}
