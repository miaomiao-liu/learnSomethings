package cn.edu.swpu.cins.learnSomethings.java8.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Java8 内置四大核心函数式接口
 * Consumer<T>: 消费型接口
 *     void accept(T t);
 *
 * Supplier:供给型接口
 *     T get();
 *
 * Function<T,R>:函数型接口
 *     R apply(T t);
 *
 * Predicate<T>:断言型接口
 *     boolean test(T t);
 * Created by miaomiao on 17-8-7.
 */
public class TestLambda3 {
    //Predicate
    @Test
    public void test4(){
        List<String> list = Arrays.asList("Hello","miaomiao","lambda","www","ok");
        list = filterStr(list,(s) -> s.length() < 3);
        System.out.println(list);
    }
    public List<String> filterStr(List<String> list,Predicate<String> pre){
        List<String> stringList = new ArrayList<>();
        for (String str : list){
            if(pre.test(str)){
                stringList.add(str);
            }
        }
        return stringList;
    }

    //Function
    @Test
    public void test3(){
        String string = strHandler("miaomiao", str -> str.substring(1,4));
        System.out.println(string);
    }
    public String strHandler(String str, Function<String,String> fun){
        return fun.apply(str);
    }

    //Supplier
    @Test
    public void test2(){
        System.out.println(getNumList(10,() -> (int)(Math.random()*100)));
    }

    public List<Integer> getNumList(int num, Supplier<Integer> sup){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i < num; i++){
            Integer n = sup.get();
            list.add(n);
        }
        return list;
    }


    //Consumer
    @Test
    public void test1(){
        happy(10000, m->System.out.println("消费："+m+"元"));
    }

    public void happy(double money, Consumer<Double> con){
        con.accept(money);
    }



}
