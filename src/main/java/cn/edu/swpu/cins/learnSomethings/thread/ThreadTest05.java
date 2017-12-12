package cn.edu.swpu.cins.learnSomethings.thread;

/**
 * yield方法是一个静态方法，
 * 作用：给同一优先级的线程让位，并且让位时间不确定
 * Created by miaomiao on 17-11-1.
 */
public class ThreadTest05 {
    public static void main(String[] args){

        Thread t = new Thread(new Processor5());

        t.setName("t");
        t.start();

        for (int i = 0; i <100;i++){
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}

class Processor5 implements Runnable {

    @Override
    public void run() {
        for (int i = 0;i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
            if (i%20 == 0) {
                //能被20整除时，让一次
                Thread.yield();
            }
        }
    }
}
