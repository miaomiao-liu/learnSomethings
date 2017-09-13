package cn.edu.swpu.cins.learnSomethings.coreJavaVolume.timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by miaomiao on 17-8-28.
 */
public class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone,the time is "+ new Date());
        //获得默认工具箱
        Toolkit.getDefaultToolkit().beep();
    }
}
