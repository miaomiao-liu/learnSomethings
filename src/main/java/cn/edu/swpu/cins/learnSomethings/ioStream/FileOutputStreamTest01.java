package cn.edu.swpu.cins.learnSomethings.ioStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by miaomiao on 17-11-3.
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args){

        FileOutputStream fos = null;

        String filePath = "/home/miaomiao/IdeaProjects/learnSomthings/src/main/resources/temp02";
        try {
            //会将源文件内容覆盖
//            fos = new FileOutputStream(filePath);

            //以追加方式写入
            fos = new FileOutputStream(filePath,true);

            String msg = "hello world ";

            byte[] bytes = msg.getBytes();

            fos.write(bytes);
            //为保证数据完全写入，刷新
            fos.flush();//强制写入

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
