package cn.edu.swpu.cins.learnSomethings.thread;

/**
 * 线程优先级
 * Created by miaomiao on 17-11-1.
 */
public class ThreadTest03 {
    public static void main(String[] args){

        System.out.println(Thread.MAX_PRIORITY);//线程优先级最高10
        System.out.println(Thread.MIN_PRIORITY);//最低1
        System.out.println(Thread.NORM_PRIORITY);//默认5

        Thread t1 = new Processor3();
        Thread t2 = new Processor3();

        t1.setName("t1");
        t2.setName("t2");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        //设置优先级 数字越大优先级越高，
        //线程优先级高仅仅表示线程获取的 CPU时间片的几率高，但是要在次数比较多，或者多次运行的时候才能看到比较好的效果。
        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();

    }
}

class Processor3 extends Thread {
    public void run(){
        for (int i = 0;i <100 ;i++){

            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }
}