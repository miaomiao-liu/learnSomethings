package cn.edu.swpu.cins.learnSomethings.coreJavaVolume.anonymousInnerClass;

import javax.swing.*;

/**
 * Created by miaomiao on 17-8-30.
 */
public class AnonymousInnerClassTest {

    public static void main(String[] args){
        TalkingClock clock = new TalkingClock();
        clock.start(1000,true);

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
