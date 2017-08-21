package cn.edu.swpu.cins.learnSomethings.timer.Robot;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

/**
 * Created by miaomiao on 17-8-2.
 */
public class Executor {
    public static void main(String[] args){
        Timer timer = new Timer();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sf.format(calendar.getTime()));

        DancingRobot dr = new DancingRobot();
        WaterRobot wr = new WaterRobot(timer);

        timer.schedule(dr,calendar.getTime(),2000);
        timer.schedule(wr,calendar.getTime(),1000);
    }



}
