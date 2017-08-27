package cn.edu.swpu.cins.learnSomethings.coreJavaVolume;

/**
 * 计算若干个数值的最大值
 * 参数数量可变的方法
 * Created by miaomiao on 17-8-27.
 */
public class MaxDouble {
    public static double max(double... values){
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if(v > largest)
                largest = v;
        }
        return largest;
    }

    public static void main(String[] args){
        System.out.println(MaxDouble.max(3.1,40.4,-5));

    }
}
