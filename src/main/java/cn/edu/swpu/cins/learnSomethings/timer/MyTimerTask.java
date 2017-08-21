package cn.edu.swpu.cins.learnSomethings.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

/**
 * Created by miaomiao on 17-7-30.
 */
public class MyTimerTask extends TimerTask{
    private String name;
    private Integer count = 0;

    public MyTimerTask() {
    }

    public MyTimerTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if(count<3) {
            System.out.println("name:" + name);
            //
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("time:" + sf.format(calendar.getTime()));
            count++;
        }else{
            //取消当前执行任务
            cancel();
            System.out.println("task cancel!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
