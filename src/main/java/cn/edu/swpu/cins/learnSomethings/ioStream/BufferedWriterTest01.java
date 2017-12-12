package cn.edu.swpu.cins.learnSomethings.ioStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by miaomiao on 17-11-4.
 */
public class BufferedWriterTest01 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/miaomiao/IdeaProjects/learnSomthings/src/main/resources/textFile/temp05",true));
        bw.write("奥运会！");

        //写入一个行分隔符
        bw.newLine();

        bw.write("开幕会没意思！");

        bw.flush();

        bw.close();
    }
}
