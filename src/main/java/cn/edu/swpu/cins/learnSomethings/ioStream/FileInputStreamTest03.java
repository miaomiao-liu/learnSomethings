package cn.edu.swpu.cins.learnSomethings.ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by miaomiao on 17-11-3.
 */
public class FileInputStreamTest03 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        byte[] bytes = new byte[3];

        try {
            String filePath = "/home/miaomiao/IdeaProjects/learnSomthings/src/main/resources/temp01";
            fis = new FileInputStream(filePath);

            //返回流中剩余的估计字节数
            System.out.println(fis.available());
            System.out.println(fis.read());
            System.out.println(fis.available());

            //跳过N个字节
            fis.skip(2);
            System.out.println(fis.read());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
