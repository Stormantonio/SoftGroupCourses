package chernenko.day7_8.socket.datagram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Anton on 13.02.2017.
 */
public class DatagramClient {

    public static int clientPort = 9099;
    public static int buffer_size = 1024;
    public static DatagramSocket ds;
    public static byte buffer[] = new byte[buffer_size];

    public static void theClient() throws Exception {
        System.out.println("Client start");
        while (true) {
            DatagramPacket p = new DatagramPacket(buffer, buffer.length);
            ds.receive(p);
            System.out.println(new String(p.getData(), 0, p.getLength()));
        }
    }

    public static void main(String args[]) throws Exception {
        ds = new DatagramSocket(clientPort);
        theClient();
    }
}
