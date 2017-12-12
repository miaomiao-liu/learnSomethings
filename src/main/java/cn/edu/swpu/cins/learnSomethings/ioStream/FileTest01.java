package cn.edu.swpu.cins.learnSomethings.ioStream;

import java.io.File;

/**
 * 查找指定目录下的所有文件
 * Created by miaomiao on 17-11-4.
 */
public class FileTest01 {

    public static void main(String[] args){
        File f = new File("//home//miaomiao//IdeaProjects//dataCastle");
        method(f);
    }

    public static void method(File f){
        if (f.isFile()){
            return;
        }

        File[] fs = f.listFiles();
        for(File subF: fs){
            System.out.println(subF.getAbsolutePath());
            method(subF);
        }

    }
}
