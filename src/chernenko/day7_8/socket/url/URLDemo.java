package chernenko.day7_8.socket.url;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Anton on 13.02.2017.
 */
public class URLDemo {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html");
        System.out.println("Protocol: "+url.getProtocol());
        System.out.println("Port: "+url.getPort());
        System.out.println("Host: "+url.getHost());
        System.out.println("File: "+url.getFile());
        System.out.println("Full URL: "+url.toExternalForm());
    }
}
