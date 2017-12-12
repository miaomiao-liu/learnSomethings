package cn.edu.swpu.cins.learnSomethings.ioStream.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by miaomiao on 17-11-4.
 */
public class ObjectOutputStreamTest01 {

    public static void main(String[] args) throws IOException {

        //User需要实现可序列化接口
        User u1 = new User("刘德华");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/miaomiao/IdeaProjects/learnSomthings/src/main/resources/textFile/temp06"));

        oos.writeObject(u1);

        oos.flush();
        oos.close();
    }
}
