package cn.edu.swpu.cins.learnSomethings.java8.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Created by miaomiao on 17-7-22.
 * 箭头左侧：参数 对应接口中抽象方法中的参数列表
 * 箭头右侧：实现的功能 Lambda体
 *
 * Lambda表达式：需要函数式接口的支持
 * 函数式接口：只有一个抽象方法的接口，可以用注解@FunctionalInterface修饰 可以检查是否是函数式接口
 */
public class TestLambda2 {

    /**
     * 方式一：无参无返回值
     */
    @Test
    public void test1(){
        Runnable r = () -> System.out.println("Hello World!");
        r.run();
    }

    /**
     * 方式二：有一个参数，无返回值
     * 只有一个参数，（）可以不写
     */
    @Test
    public void test2(){
        Consumer<String> con = (x) -> System.out.println(x);
        con.accept("hello miaomiao!");
    }

    /**
     * 方式三：有两个以上个参数，且Lambda体中有多条语句，有返回值
     */
    @Test
    public void test3(){
        Comparator<Integer> com = (x,y) ->{
            System.out.println("函数式接口");
            return Integer.compare(x,y);
        };
        System.out.println(com.compare(7,5));
    }

    /**
     * 若Lambda体中只有一条语句，return和{}都可以省略不写
     */
    @Test
    public void test4(){
       Comparator<Integer> com = (x,y) -> Integer.compare(x,y);
       System.out.println(com.compare(1,0));
    }
}
