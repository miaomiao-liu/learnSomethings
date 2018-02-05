package cn.edu.swpu.cins.learnSomethings.JUC_AtGuiGU;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Condition线程通信：
 *     condition的awaite(),signal(),signalAll()方法等同于，
 *     synchronized  关键字的waite(),notify(),notifyAll()方法
 *
 * Created by miaomiao on 17-12-17.
 */
public class TestProductorAndConsumerForLock {
    public static void main(String[] args) {
        Clerk01 clerk = new Clerk01();

        Productor01 pro = new Productor01(clerk);
        Consumer01 con = new Consumer01(clerk);

        new Thread(pro,"生产者A").start();
        new Thread(con,"消费者B").start();
        new Thread(pro,"生产者C").start();
        new Thread(con,"消费者D").start();
    }
}

class Clerk01 {

    private int product;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void get() {
        lock.lock();

        try {
            while (product >= 1) {
                System.out.println("产品已满");
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName() + ":" + ++product);
            condition.signalAll();
        } finally {
            lock.unlock();
        }

    }

    public void sale() {
        lock.lock();
        try {
            while (product <= 0) {
                System.out.println("缺货");
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + ":" + --product);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}

    class Productor01 implements Runnable{
        private Clerk01 clerk;

        public Productor01(Clerk01 clerk) {
            this.clerk = clerk;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i<20; i++){
                clerk.get();
            }
        }
    }

    class Consumer01 implements Runnable{

        private Clerk01 clerk;

        public Consumer01(Clerk01 clerk) {
            this.clerk = clerk;
        }

        @Override
        public void run() {
            for (int i = 0; i<20;i++){
                clerk.sale();

            }
        }
}
