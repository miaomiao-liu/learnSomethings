package cn.edu.swpu.cins.learnSomethings.ioStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 转换流(字节输入流--->字符输入流)
 * Created by miaomiao on 17-11-3.
 */
public class FileReaderTest01 {

    public static void main(String[] args){

        FileReader fr = null;

        try {
            fr = new FileReader("/home/miaomiao/IdeaProjects/learnSomthings/src/main/resources/temp01");

            int temp = 0;
            char[] chars = new char[512];//1kb
            while((temp = fr.read(chars)) != -1){
                //将char有效部分转换为字符串
                System.out.println(new String(chars,0,temp));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
