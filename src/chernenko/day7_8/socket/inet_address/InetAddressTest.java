package chernenko.day7_8.socket.inet_address;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Anton on 13.02.2017.
 */
public class InetAddressTest {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.nba.com");
        System.out.println(address);

        InetAddress sw[] = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < sw.length; i++) {
            System.out.println(sw[i]);
        }


    }
}
