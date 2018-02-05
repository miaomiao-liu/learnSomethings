package cn.edu.swpu.cins.learnSomethings.JUC_AtGuiGU;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *一. i++的原子性问题：
 *      i = 10;
 *      i++   //10
 *实际为三部操作：“读——改——写”
 *      int temp =i;
 *      i = i++;
 *      i = temp;
 *
 * 二.原子变量：java.util.concurrent.atomic包下提供了常用的原子变量，
 *      1.volatile 保证了内存可见性
 *      2.CAS(Compare-And-Swap)算法保证数据的原子性。
 *         CAS包含了三个操作数：
 *         内存值：V
 *         预估值：A
 *         更新值：B
 *        当且仅当 V == A 时，V = B，否则，不做任何操作。
 *
 * 运行多次会出现多线程安全（原子）问题
 * Created by miaomiao on 17-12-13.
 */
public class TestAtomicDemo {

    public static void main(String[] args) {
        AtomicDemo ad = new AtomicDemo();

        for (int i = 0; i < 10; i++) {
            new Thread(ad).start();
        }
    }
}

class AtomicDemo implements Runnable{

//    private volatile int serialNumber = 0;
    //使用原子变量
    private AtomicInteger serialNumber = new AtomicInteger();

    public int getSerialNumber(){
//        return serialNumber;
        return serialNumber.getAndIncrement();
    }

    @Override
    public void run() {

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getSerialNumber());
    }
}
