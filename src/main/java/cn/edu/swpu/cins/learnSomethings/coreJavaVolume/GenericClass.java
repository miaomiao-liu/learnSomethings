package cn.edu.swpu.cins.learnSomethings.coreJavaVolume;

/**
 * 泛型类
 * Created by miaomiao on 17-9-2.
 */
public class GenericClass<T> {

    private T first;
    private T second;

    public GenericClass(){
        first = null;
        second = null;
    }

    public GenericClass(T first,T second){
        this.first = first;
        this.second = second;
    }

    //泛型方法
    public static <T> T getMiddle(T... a){
        return a[a.length/2];
    }

    //调用一个泛型方法时，在方法名前的尖括号中放入具体的类型(可省略)
    String middle = GenericClass.<String>getMiddle("John","Q.","public");


    //类型变量的限定
    //<T extends Comparable> :T是绑定类型的子类型，T和绑定类型可以是类，也可以是接口
    //可以有多个限定，限定类型用“&”分隔
    public static <T extends Comparable> T min(T[] a){
        if(a == null || a.length == 0) return null;
        T smallest = a[0];
        for (int i = 0; i <a.length ; i++){
            //不能确定T所属的类有comparaTo方法 使用限定
            if(smallest.compareTo(a[i]) > 0)
                smallest = a[i];
        }
        return smallest;
    }


    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

}
