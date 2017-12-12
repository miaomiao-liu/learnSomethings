package cn.edu.swpu.cins.learnSomethings.ioStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by miaomiao on 17-11-4.
 */
public class BufferedReaderTest02 {

    public static void main(String[] args) throws IOException {
        /*以空格结束，只能读到空格之前的输入
        //system.in 是一个标准的输入流，默认接受键盘的输入
        Scanner s = new Scanner(System.in);

        String str = s.next();
        System.out.println("你输入了："+str);
        */

        //可以读一行输入，不管有没有空格
        //使用BufferedReader来接受用户的输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //接受输入，一次一行
        String str = br.readLine();
        System.out.println("你输入了："+str);

    }
}
