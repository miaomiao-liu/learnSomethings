package cn.edu.swpu.cins.learnSomethings.timer.Robot;

import java.text.SimpleDateFormat;
import java.util.TimerTask;

/**
 * Created by miaomiao on 17-8-2.
 */
public class DancingRobot extends TimerTask {

    @Override
    public void run() {

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sf.format(scheduledExecutionTime()));
        System.out.println("dance !!!");
    }
}
