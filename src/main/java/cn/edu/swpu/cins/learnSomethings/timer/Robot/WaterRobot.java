package cn.edu.swpu.cins.learnSomethings.timer.Robot;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by miaomiao on 17-8-2.
 */
public class WaterRobot extends TimerTask {
    private Integer bucket = 0;
    private Timer timer;

    public WaterRobot(Timer timer) {

        this.timer = timer;
    }

    @Override
    public void run() {

        if(bucket<5){
            System.out.println("add 1L water into bucket!");
            bucket++;
        }else {
            cancel();
            System.out.println("waterRobot has been aborted");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        timer.cancel();
        }
    }
}
