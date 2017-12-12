package cn.edu.swpu.cins.learnSomethings.collection.collectionTest02.others;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 泛型
 * 编译阶段的语法
 * 在编译阶段统一集合的类型
 * Created by miaomiao on 17-10-29.
 */
public class GenericTest02 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

//        list.add(1); error 只能添加String类型

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String l = it.next(); //返回string类型，之前需要强制转换
        }
    }
}
