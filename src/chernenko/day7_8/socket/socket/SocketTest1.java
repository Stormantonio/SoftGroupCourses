package chernenko.day7_8.socket.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Anton on 13.02.2017.
 */
public class SocketTest1 {

    public static void main(String args[]) throws Exception {
        int c;
        // Создает сокетное соединение с internic.net, порт 43.
        Socket s = new Socket("whois.internic.net", 43);
        // Получает входной и выходной потоки.
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        // Создать строку запроса.
        String str = (args.length == 0 ? "MHProfessional.com" : args[0])
                + "\n";
        // Преобразует в байты,
        byte buff[] = str.getBytes();
        // Посылает запрос,
        out.write(buff);
        // Читает и отображает ответ,
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        s.close();
    }
}
