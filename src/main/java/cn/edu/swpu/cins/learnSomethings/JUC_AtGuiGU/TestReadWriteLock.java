package cn.edu.swpu.cins.learnSomethings.JUC_AtGuiGU;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁：
 *   写写/读写： “互斥”
 *   读读：不需要互斥
 * Created by miaomiao on 17-12-17.
 */
public class TestReadWriteLock {
    public static void main(String[] args) {
        ReadWriteDemo rwd = new ReadWriteDemo();

        new Thread(new Runnable() {
            @Override
            public void run() {
                rwd.set((int)(Math.random() * 101));
            }
        },"write").start();

        for (int i = 1; i< 100; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    rwd.get();
                }
            }).start();
        }
    }
}

class ReadWriteDemo{

    private int number;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void get(){
        lock.readLock().lock();
        try{
            System.out.println(Thread.currentThread().getName()+":"+number);

        }finally {
            lock.readLock().unlock();
        }
    }

    public void set(int number){

        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName());
            this.number = number;
        }finally {
            lock.writeLock().unlock();
        }

    }
}
