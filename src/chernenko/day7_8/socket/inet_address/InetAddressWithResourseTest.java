package chernenko.day7_8.socket.inet_address;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Anton on 13.02.2017.
 */
public class InetAddressWithResourseTest {

    public static void main(String args[]) throws Exception {
        int c;
// Создает сокетное соединение с internic.net, порт 43.
// Этим сокетом управляет блок try-с-ресурсами.
        try (Socket s = new Socket("whois.internic.net", 43)) {
// Получает входной и выходной потоки.
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
// Создать строку запроса.
            String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "/\n";
// Преобразует в байты,
            byte buf[] = str.getBytes();
// Посылает запрос,
            out.write(buf);
// Читает и отображает ответ,
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        }
// Теперь сокет закрыт.
    }
}
