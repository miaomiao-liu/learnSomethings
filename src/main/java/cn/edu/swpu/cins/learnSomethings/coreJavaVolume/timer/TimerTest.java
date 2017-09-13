package cn.edu.swpu.cins.learnSomethings.coreJavaVolume.timer;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by miaomiao on 17-8-28.
 */
public class TimerTest {
    public static void main(String[] args){
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000,listener);
        //启动成功将调用监听器的额actionPerformed
        t.start();

        //包含一条消息和ok按钮的对话框。点击ok结束程序
        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);
    }
}
