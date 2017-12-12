package cn.edu.swpu.cins.learnSomethings.thread;

/**
 *线程的创建和启动方式一：
 *     继承Thread，重写run方法
 * Created by miaomiao on 17-11-1.
 */
public class ThreadTest01 {
    public static void main(String[] args){

        Thread t = new Processor1();

        t.start();

        for (int i = 0;i < 10;i++){
            System.out.println("main --->" + i);

        }
    }
}

class Processor1 extends Thread{
    public void run(){
        for (int i = 0;i < 10;i++) {
            System.out.println("run --->" + i);
        }
    }
}