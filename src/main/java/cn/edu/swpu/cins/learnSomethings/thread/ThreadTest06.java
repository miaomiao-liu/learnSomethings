package cn.edu.swpu.cins.learnSomethings.thread;

/**
 * 线程的合并
 * Created by miaomiao on 17-11-1.
 */
public class ThreadTest06 {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new Processor6());
        t.setName("t");
        t.start();

        //合并,合并后变为单线程,就是一个单线程程序
        t.join();

        for (int i = 0; i <10;i++){
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }

    }
}

class Processor6 implements Runnable {

    @Override
    public void run() {
        for (int i = 0;i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}