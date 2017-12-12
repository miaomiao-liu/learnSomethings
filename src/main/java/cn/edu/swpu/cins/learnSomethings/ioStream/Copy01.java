package cn.edu.swpu.cins.learnSomethings.ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制粘贴
 * Created by miaomiao on 17-11-3.
 */
public class Copy01 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("/home/miaomiao/IdeaProjects/learnSomthings/src/main/resources/temp01");
            FileOutputStream fos = new FileOutputStream("/home/miaomiao/IdeaProjects/learnSomthings/src/main/resources/temp03");

            int temp = 0;
            byte[] bytes = new byte[1024];//1kb

            while ((temp = fis.read(bytes)) != -1){
                fos.write(bytes,0,temp);
            }

            fos.flush();

            fis.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
