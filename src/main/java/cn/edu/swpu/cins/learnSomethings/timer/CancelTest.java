package cn.edu.swpu.cins.learnSomethings.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * Created by miaomiao on 17-7-30.
 */
public class CancelTest {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        MyTimerTask task1 = new MyTimerTask("task1");
        MyTimerTask task2 = new MyTimerTask("task2");

        Date startTime = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("start time is:"+sf.format(startTime));

        timer.schedule(task1,3000,2000);
        timer.schedule(task2,1000,2000);

        //从此计时器的队列中移除所有被取消的任务，并返回取消任务数
        System.out.println("canceled task number is:"+timer.purge());

        //等待millis毫秒
        Thread.sleep(5000);
        Date cancelTime = new Date();
        System.out.println("cancel time is:"+sf.format(cancelTime));

        //取消所有任务
//        timer.cancel();

        task2.cancel();
        System.out.println("task all canceled!");
        System.out.println("canceled task number is:"+timer.purge());
    }
}
