package chernenko.day3_4;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by java-2-03 on 29.01.2017.
 */
public class TestSerializable {

    public void serialize(ClassForSerializable cfs) throws IOException {
        FileOutputStream fos = new FileOutputStream("C://test//hello1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cfs);
        oos.flush();
        oos.close();
    }

    public ClassForSerializable deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C://test//hello1.txt");
        ObjectInputStream oin = new ObjectInputStream(fis);
        return (ClassForSerializable) oin.readObject();
    }

    public static void main(String[] args) {
        TestSerializable serializable = new TestSerializable();
        ClassForSerializable cfs = new ClassForSerializable();

        try {
            serializable.serialize(cfs);
            System.out.println(serializable.deserialize());
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(TestSerializable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
