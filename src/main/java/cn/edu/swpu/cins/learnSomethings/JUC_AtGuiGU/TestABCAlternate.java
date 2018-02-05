package cn.edu.swpu.cins.learnSomethings.JUC_AtGuiGU;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程按序交替：
 *    编写一个程序，开启3个线程，这三个线程的ID分别为A,B,C，每个线程分别将自己的ID
 *    在屏幕上打印10遍，要求输出的结果必须按顺序显示：
 *       例：ABCABCABC。。。。。
 * Created by miaomiao on 17-12-17.
 */
public class TestABCAlternate {
    public static void main(String[] args) {
        AlternateDemo ad = new AlternateDemo();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1;i <= 10;i++){
                    ad.loopA(i);
                }
            }
        },"A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1;i <= 10;i++){
                    ad.loopB(i);
                }
            }
        },"B").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1;i <= 10;i++){
                    ad.loopC(i);
                }
            }
        },"C").start();
    }
}

class AlternateDemo{

    private int num = 1;
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    public void loopA(int TotalLoop){
        lock.lock();

        try{
            //等待
            if (num != 1){
                condition1.await();
            }
            //执行
            System.out.println(Thread.currentThread().getName()+"\t"+TotalLoop);
            //唤醒
            num = 2;
            condition2.signal();

        }catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void loopB(int TotalLoop){
        lock.lock();

        try{
            //等待
            if (num != 2){
                condition2.await();
            }
            //执行
            System.out.println(Thread.currentThread().getName()+"\t"+TotalLoop);
            //唤醒
            num = 3;
            condition3.signal();

        }catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void loopC(int TotalLoop){
        lock.lock();

        try{
            //等待
            if (num != 3){
                condition3.await();
            }
            //执行
            System.out.println(Thread.currentThread().getName()+"\t"+TotalLoop);
            //唤醒
            num = 1;
            condition1.signal();

        }catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

}
