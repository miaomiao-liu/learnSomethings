package cn.edu.swpu.cins.learnSomethings.thread;

/**
 * 中断休眠:依靠异常处理机制
 * Created by miaomiao on 17-11-1.
 */
public class ThreadTest04 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Processor4());

        t.setName("t");
        t.start();

        //五秒之后中断
        Thread.sleep(5000);
        t.interrupt();
    }
}

class Processor4 implements Runnable {

    @Override
    public void run() {
        try {
            //休眠未完成，捕获中断异常
            Thread.sleep(10000000);//
            System.out.println("hello world!");//不会输出
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0;i < 10; i++){
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }
}