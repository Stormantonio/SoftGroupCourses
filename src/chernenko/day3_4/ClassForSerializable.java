package chernenko.day3_4;

import java.io.Serializable;

/**
 * Created by java-2-03 on 29.01.2017.
 */
public class ClassForSerializable implements Serializable {

    public byte field = 10;
    public String str = "Some string";


    @Override
    public String toString() {
        return "ClassForSerializable{" + "field=" + field + ", str='" + str + '\'' + '}';
    }
}
