package cn.edu.swpu.cins.learnSomethings.ioStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * Created by miaomiao on 17-11-4.
 */
public class BufferedReaderTest01 {

    public static void main(String[] args){

        try {
            //创建一个文件字符输入流
            FileReader fr = new FileReader("/home/miaomiao/IdeaProjects/learnSomthings/src/main/java/cn/edu/swpu/cins/learnSomethings/ioStream/BufferedReaderTest01.java");
            //将文件字符输入流包装成带有缓冲区的字符输入流
            BufferedReader br = new BufferedReader(fr);

            String temp = null;
            //一次读一行，但是行尾不带换行符
            while((temp = br.readLine()) != null){
                System.out.println(temp);
            }


            //只需关闭包装流
            br.close();
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
