package myIOC.beans.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Yilia on 2018/4/7.
 * Resource是spring内部定位资源的接口。
 */
public interface Resource {
  InputStream getInputStream() throws IOException;
}

