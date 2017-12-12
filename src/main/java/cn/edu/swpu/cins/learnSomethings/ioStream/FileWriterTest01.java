package cn.edu.swpu.cins.learnSomethings.ioStream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by miaomiao on 17-11-4.
 */
public class FileWriterTest01 {

    public static void main(String[] args){

        FileWriter fw = null;

        try {
            fw = new FileWriter("/home/miaomiao/IdeaProjects/learnSomthings/src/main/resources/temp04",true);

            fw.write("我是中国人!!");//直接写字符串

            //写入字符数组的一部分
            char[] chars = {'我','是','中','国','人','。','！'};
            fw.write(chars,0,5);

            fw.flush();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
