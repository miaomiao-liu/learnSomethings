package cn.edu.swpu.cins.learnSomethings.jvm;

/**
 * 静态语句块中只能访问到定义在静态语句块之前的变量，
 * 定义在它之后的变量，在前面的静态语句中可以赋值，但是不能访问。
 * Created by miaomiao on 17-12-11.
 */
public class Test01 {
    public static void main(String[] args){
        System.out.println(Child.b);
    }
}

class Father{

    //只能给a赋值，不能访问
    static{
        a = 2;
//        System.out.println(a);  非法向前引用
    }

    public static int a = 1;

}

class Child extends Father{
    public static int b = a;
}



