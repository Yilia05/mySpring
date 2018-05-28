package myIOC.beans.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Yilia on 2018/4/7.
 */
public class UrlResource implements Resource {

  private final URL url;

  public UrlResource(URL url) {
    this.url = url;
  }

  @Override
  public InputStream getInputStream() throws IOException {
    URLConnection urlConnection = url.openConnection();
    urlConnection.connect();
    return urlConnection.getInputStream();
  }
}

