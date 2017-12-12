package cn.edu.swpu.cins.learnSomethings.ioStream.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * //反序列化
 * Created by miaomiao on 17-11-4.
 */
public class ObjectInputStreamTest01 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/miaomiao/IdeaProjects/learnSomthings/src/main/resources/textFile/temp06"));

        //反序列化
        Object o = ois.readObject();

        System.out.println(o.toString());

        ois.close();

    }
}
