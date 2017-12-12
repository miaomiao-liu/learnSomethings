package cn.edu.swpu.cins.learnSomethings.thread;

/**
 * 抛出异常：
 * wait()方法：必须获取到monitor对象才能运用（Java中只能通过Synchronized关键字来完成）
 * 程试图等待对象的监视器或者试图通知其他正在等待对象监视器的线程，但本身没有对应的监视器的所有权。
 * 在方法上加上synchronized即可
 * Created by miaomiao on 17-11-30.
 */
public class ThreadTest09 {

    public void testWait(){
        System.out.println("Start-----");
        try {
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End-------");
    }

    public static void main(String[] args) {
        final ThreadTest09 test = new ThreadTest09();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test.testWait();
            }
        }).start();
    }
}
