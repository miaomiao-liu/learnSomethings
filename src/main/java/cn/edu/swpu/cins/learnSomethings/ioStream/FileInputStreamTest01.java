package cn.edu.swpu.cins.learnSomethings.ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件字节输入流：按照字节方式读取文件
 * Created by miaomiao on 17-11-2.
 */
public class FileInputStreamTest01 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            //相对路径或绝对路径
            String filePath = "/home/miaomiao/IdeaProjects/learnSomthings/src/main/resources/temp01";
            fis = new FileInputStream(filePath);

            int i1 = fis.read();
            int i2 = fis.read();
            int i3 = fis.read();
            int i4 = fis.read();
            int i5 = fis.read();
            int i6 = fis.read();
            int i7 = fis.read();

            System.out.println(i1);
            System.out.println(i2);
            System.out.println(i3);
            System.out.println(i4);
            System.out.println(i5);
            System.out.println(i6);
            System.out.println(i7);//当读到文件末尾时，输出-1

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    //保证流一定会被释放
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
