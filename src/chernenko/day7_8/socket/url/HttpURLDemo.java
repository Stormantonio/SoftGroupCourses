package chernenko.day7_8.socket.url;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Anton on 13.02.2017.
 */
public class HttpURLDemo {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.google.com");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        System.out.println("Request method: " + con.getRequestMethod());

        System.out.println("Request message: " + con.getResponseMessage());

        Map<String, List<String>> hdrMap = con.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();

        for (String key : hdrField) {
            System.out.println("Ключ: " + key + " Значение: "
                    + hdrMap.get(key));
        }
    }
}
