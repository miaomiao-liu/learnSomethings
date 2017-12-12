package cn.edu.swpu.cins.learnSomethings.thread;

/**
 * 线程的创建和启动方式二：
 *     写Runnable接口的实现类，实现run方法
 * Created by miaomiao on 17-11-1.
 */
public class ThreadTest02 {
    public static void main(String[] args){
        Thread t = new Thread(new Processor2());

        t.start();

        for (int i = 0;i < 10;i++){
            System.out.println("main --->" + i);

        }
    }
}

class Processor2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i < 10;i++){
            System.out.println("run --->"+i);
        }
    }
}
