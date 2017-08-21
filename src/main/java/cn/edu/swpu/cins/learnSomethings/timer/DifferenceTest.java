package cn.edu.swpu.cins.learnSomethings.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 比较schedule()方法和scheduleAtFixedRate()方法：
 * 1) 本该执行时间早于当前时间：schedule()从当前时间开始执行
 *                          scheduleAtFixedRate()从本该执行时间开始把应该执行的任务一次执行完，然后按照当前时间执行
 * 2)执行时间间隔小于一次执行任务的时间：schedule()按照上一次任务执行完时间为下一次执行开始时间
 *                                  scheduleAtFixedRate()按照上一次开始执行时间+时间间隔 为下一次任务执行开始时间
 * Created by miaomiao on 17-8-2.
 */
public class DifferenceTest {

    public static void main(String[] args){

        final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();

        System.out.println("当前时间为："+sf.format(calendar.getTime()));

        calendar.add(Calendar.SECOND,-6);

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println("当前时间："+sf.format(scheduledExecutionTime()));

            }
        }, calendar.getTime(), 2000);

        }
}
