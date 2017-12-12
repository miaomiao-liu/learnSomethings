package cn.edu.swpu.cins.learnSomethings.collection.collectionTest02.others;

/**
 * Created by miaomiao on 17-10-29.
 */
public class GenericTest03 {

    public static void main(String[] args){

        MyClass<String> mc = new MyClass<>();

        mc.m1("miaomiao");
    }
}


//自定义泛型
class MyClass<T>{
    public void m1(T t){
        System.out.println(t);
    }
}