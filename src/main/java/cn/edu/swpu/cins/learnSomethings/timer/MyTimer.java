package cn.edu.swpu.cins.learnSomethings.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

/**
 * Timer有且只有一个线程去执行任务
 * 不支持并发执行
 * 对复杂任务的调度最好不要使用Timer
 * Created by miaomiao on 17-7-30.
 */
public class MyTimer {
    public static void main(String[] args){
        Timer timer = new Timer();
        MyTimerTask myTimerTask = new MyTimerTask("miaomiao");
        //两秒之后开始执行，之后每隔一秒钟执行一次
//        timer.schedule(myTimerTask,2000L,1000L);

        Calendar calendar = Calendar.getInstance();
        //设置时间格式
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sf.format(calendar.getTime()));
        calendar.add(Calendar.SECOND,3);

        /**
         * timer 中schedule 的四种用法：
         * 1）schedule(task,time):
         * 在时间等于或超过time时，执行一次task
         */
//        myTimerTask.setName("schedule 1");
//        timer.schedule(myTimerTask,calendar.getTime());

        /**
         * 2) schedule(task,time,period):
         * 在时间等于或超过time时，执行一次task，之后每隔period毫秒执行一次
         */
        myTimerTask.setName("schedule 2");
        timer.schedule(myTimerTask,calendar.getTime(),2000);

        /**
        * 3) schedule(task,delay):
        * 等待delay毫秒后执行且只执行一次
        */
//        myTimerTask.setName("schedule 3");
//        timer.schedule(myTimerTask,2000);

        /**
         * 4) schedule(task,delay,period)
         * 等待delay毫秒后执行且只执行一次,之后每隔period毫秒后执行一次
         */
//           myTimerTask.setName("schedule 4");
//           timer.schedule(myTimerTask,2000,4000);


        /**
         * timer 中scheduleAtFixedRate 的两种用法：
         * 1) scheduleAtFixedRate(task,time,period):
         * 在时间等于或超过time时，执行一次task，之后每隔period毫秒执行一次
         */
//          myTimerTask.setName("scheduleAtFixedRate 1");
//          timer.scheduleAtFixedRate(myTimerTask,calendar.getTime(),2000);


        /**
         * 2) scheduleAtFixedRate(task,delay,period)
         * 等待delay毫秒后执行且只执行一次,之后每隔period毫秒后执行一次
         */
//        myTimerTask.setName("scheduleAtFixedrate 2");
//        timer.scheduleAtFixedRate(myTimerTask,2000,4000);


//        myTimerTask.setName("schedule");
//        timer.schedule(myTimerTask,2000);
        //scheduledExecutionTime() 打印当前最近的一次计划时间
//        System.out.println("scheduled time is :"
//                +sf.format(myTimerTask.scheduledExecutionTime()));

    }
}
