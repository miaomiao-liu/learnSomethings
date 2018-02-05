package cn.edu.swpu.cins.learnSomethings.JUC_AtGuiGU;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建执行线程的方式三：实现Callable 接口
 *          相较于实现Runnable接口的方式，方法可以有返回值，并且可以抛出异常
 *
 * 执行Callable的方法：需要FutureTask实现类的支持，用于接受返回值，FutureTask是Future接口的实现类
 *                    FutureTask可用于闭锁
 * Created by miaomiao on 17-12-16.
 */
public class TestCallable {
    public static void main(String[] args) {

        ThreadDemo01 td = new ThreadDemo01();

        FutureTask<Integer> result = new FutureTask<Integer>(td);

        new Thread(result).start();

        //接受运算后的结果
        try {
            //只有当线程运行完以后，result.get()才会执行，相当于闭锁
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}

class ThreadDemo01 implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++){
            System.out.println(i);
            sum += i;
        }

        return sum;
    }
}