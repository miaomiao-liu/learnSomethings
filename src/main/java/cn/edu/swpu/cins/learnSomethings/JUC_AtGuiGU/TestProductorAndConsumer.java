package cn.edu.swpu.cins.learnSomethings.JUC_AtGuiGU;

/**
 * 生产者消费者案例
 *   虚假唤醒
 * Created by miaomiao on 17-12-16.
 */
public class TestProductorAndConsumer {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Productor pro = new Productor(clerk);
        Consumer con = new Consumer(clerk);

        new Thread(pro,"生产者A").start();
        new Thread(con,"消费者B").start();
        new Thread(pro,"生产者C").start();
        new Thread(con,"消费者D").start();
    }
}

class Clerk{

    private int product;

    public synchronized void get(){

        //避免虚假唤醒，wait()总是运用在while循环中
//        if(product > 10){
        while(product >= 1){
            System.out.println("产品已满");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName()+":"+ ++product);
        this.notifyAll();

    }
    public synchronized void  sale(){
//        if (product <= 0){
        while (product <= 0){
            System.out.println("缺货");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+":"+ --product);
        this.notifyAll();

    }
}

class Productor implements Runnable{
    private Clerk clerk;

    public Productor(Clerk clerk) {
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

class Consumer implements Runnable{

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i<20;i++){
            clerk.sale();

        }
    }
}
