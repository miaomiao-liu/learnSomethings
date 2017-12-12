package cn.edu.swpu.cins.learnSomethings.thread;

/**
 * 守护线程：用户线程结束后结束
 * 守护线程一般是无限执行的
 * Created by miaomiao on 17-11-1.
 */
public class ThreadTest08 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Processor8();
        t1.setName("t1");
        //将线程设置为守护线程
        t1.setDaemon(true);

        t1.start();

        //主线程
        for (int i = 0;i < 10; i++){
            System.out.println(Thread.currentThread().getName()+i);
            Thread.sleep(1000);
        }
    }
}

class Processor8 extends Thread{

    public void run(){
        int i = 0;
        //无限循环，但是作为守护线程，用户线程结束后自动结束
        while(true){
            i++;
            System.out.println(Thread.currentThread().getName()+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
