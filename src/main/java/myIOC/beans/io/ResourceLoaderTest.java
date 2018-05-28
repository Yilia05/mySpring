package myIOC.beans.io;

import java.io.IOException;
import java.io.InputStream;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yilia on 2018/4/7.
 */
public class ResourceLoaderTest {

  @Test
  public void test() throws IOException {
    ResourceLoader resourceLoader = new ResourceLoader();
    Resource resource = resourceLoader.getResource("myIoc.xml");
    InputStream inputStream = resource.getInputStream();
    Assert.assertNotNull(inputStream);
  }

}
