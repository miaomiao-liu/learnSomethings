package cn.edu.swpu.cins.learnSomethings.JUC_AtGuiGU;

/**
 * volatile关键字：当多个线程进行操作共享数据时，可以保证内存中的数据是可见的
 *              相较上一年插入哦synchronised是一种较轻量的同步策略
 *
 *  注意：1.不具备“互斥性”
 *       2.不保证变量的“原子性”
 * Created by miaomiao on 17-12-12.
 */
public class TestVolatile {

    public static void main(String[] args) {

        ThreadDemo td = new ThreadDemo();

        new Thread(td).start();

        while (true){

            if (td.isFlag()) {
                System.out.println("------------");
                break;
            }
            /*
            //同步锁，效率低
            synchronized (td) {
                if (td.isFlag()) {
                    System.out.println("------------");
                    break;
                }
            }
            */
        }
    }
}

class ThreadDemo implements Runnable{

    private volatile boolean flag = false;

    @Override
    public void run() {

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;

        System.out.println("flag = "+flag);
    }

    public boolean isFlag() {
        return flag;
    }
}
