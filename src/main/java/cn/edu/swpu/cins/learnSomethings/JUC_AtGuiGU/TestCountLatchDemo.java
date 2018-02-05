package cn.edu.swpu.cins.learnSomethings.JUC_AtGuiGU;

import java.util.concurrent.CountDownLatch;

/**
 * 闭锁：CountDownLatch：在完成名某些运算时，只有其他所有的线程全部完成，当前计算才执行。
 *
 * 例：计算多个同步线程执行的时间;
 * Created by miaomiao on 17-12-14.
 */
public class TestCountLatchDemo {
    public static void main(String[] args) {

        final CountDownLatch latch = new CountDownLatch(5);
        LatchDemo ld = new LatchDemo(latch);

        long start = System.currentTimeMillis();

        for (int i=0; i < 5; i++){
            new Thread(ld).start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        System.out.println("执行时间为："+ (end-start));
    }
}

class LatchDemo implements Runnable{

    private CountDownLatch latch;

    public LatchDemo(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {

        synchronized (this){
            try {

                for(int i = 0; i < 50000; i++){
                    if(i%2 == 0){
                        System.out.println(i);
                    }
                }
            }finally {
                latch.countDown();
            }
        }

    }
}