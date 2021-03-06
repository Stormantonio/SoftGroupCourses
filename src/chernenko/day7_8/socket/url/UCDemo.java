package chernenko.day7_8.socket.url;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * Created by Anton on 13.02.2017.
 */
public class UCDemo {

    public static void main(String[] args) throws Exception {
        int c;
        URL url = new URL("https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html");
        URLConnection connection = url.openConnection();

        //get data
        long d = connection.getDate();
        if (d == 0) {
            System.out.println("No date information");
        } else {
            System.out.println(new Date(d));
        }

        System.out.println("Content type: " + connection.getContentType());

        d = connection.getExpiration();
        if (d == 0) {
            System.out.println("No date information about duration");
        } else {
            System.out.println("Outdated: " + new Date(d));
        }

        d = connection.getLastModified();
        if (d == 0) {
            System.out.println("No date information about last modified");
        } else {
            System.out.println("Last modified: " + new Date(d));
        }

        long len = connection.getContentLengthLong();
        if (len == -1) {
            System.out.println("Content length is not available");
        } else {
            System.out.println("Content length: " + len);
        }

        if (len != 0) {
            System.out.println("----Content----");
            InputStream is = connection.getInputStream();
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();
        } else {
            System.out.println("Content isn't available");
        }
    }
}
