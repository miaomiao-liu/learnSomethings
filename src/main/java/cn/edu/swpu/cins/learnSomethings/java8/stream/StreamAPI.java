package cn.edu.swpu.cins.learnSomethings.java8.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * google博客 ：java8 中的Streams API 详解
 * Created by miaomiao on 17-8-8.
 */
public class StreamAPI {

    //清单4 ：构造流的几种常见方法
    @Test
    public void test4(){

        //1.Individual
        Stream stream = Stream.of("a","b","c");
        //2.Arrays
        String[] strArray = new String[] {"a","b","c"};
        stream = Stream.of(strArray);
        stream = Arrays.stream(strArray);
        //3.Collections
        List<String> list = Arrays.asList(strArray);
        stream = list.stream();
    }

    //清单13
    @Test
    public void test13(){
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        /**
         * forEach 是 terminal 操作，因此它执行后，Stream 的元素就被“消费”掉了，
         * 你无法对一个 Stream 进行两次 terminal 运算。下面的代码是错误的：
         * 运行报错：
         * java.lang.IllegalStateException: stream has already been operated upon or closed
         */
//        Stream stream = Stream.of("one","two","three");
//        stream.forEach(element -> System.out.println(element));
//        stream.forEach(element -> System.out.println(element));
    }

    //清单15 ： reduce的用例
    //reduce()第一个参数为起始值
    @Test
    public void test15(){

        //字符串连接
        String concat = Stream.of("A","B","C","D")
                .reduce("",String :: concat);
        System.out.println(concat);

        //最小值
        Double minValue = Stream.of(-1.5,3.0,-8.0,4.7)
                .reduce(Double.MAX_VALUE,Double :: min);
        System.out.println(minValue);

        //求和
        int sum = Stream.of(1,2,3,4).reduce(0,Integer::sum);
        System.out.println(sum);

        // 过滤，字符串连接，concat = "ace"
        concat = Stream.of("a", "B", "c", "D", "e", "F").
                filter(x -> x.compareTo("Z") > 0).
                reduce("", String::concat);
        System.out.println(concat);
    }

}
