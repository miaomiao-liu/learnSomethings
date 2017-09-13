package cn.edu.swpu.cins.learnSomethings.coreJavaVolume.anonymousInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by miaomiao on 17-8-30.
 */
public class TalkingClock {
    public void start(int interval, boolean beep){
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone , the time is "+ new Date());
                if(beep) Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer t = new Timer(interval,listener);
        t.start();
    }
}
