package cn.edu.swpu.cins.learnSomethings.ioStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by miaomiao on 17-11-2.
 */
public class FileInputStreamTest02 {
    public static void main(String[] args){
        /*
        * int read();
        * 在读取之前准备一个byte[]数组，每次读取多个字节存储在数组中，
        * 效率高
        */
        FileInputStream fis = null;
        byte[] bytes = new byte[3];

        try {
            String filePath = "/home/miaomiao/IdeaProjects/learnSomthings/src/main/resources/temp01";
            fis = new FileInputStream(filePath);

            int  t1= fis.read(bytes);//返回读取的文件字节数,缓冲区

            //将byte数组转换为字符串
            System.out.println(new String(bytes));

            int  t2= fis.read(bytes);
            System.out.println(new String(bytes));

            int  t3= fis.read(bytes);
//            System.out.println(new String(bytes));//gef,只剩g一个没有读取，ef是无效的
            System.out.println(new String(bytes,0,t3));//只转换有效部分

            int  t4= fis.read(bytes);//末尾返回-1

            System.out.println(t1);
            System.out.println(t2);
            System.out.println(t3);
            System.out.println(t4);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
