package cn.edu.swpu.cins.learnSomethings.offer;

/**
 * 斐波那契数列
 * Created by miaomiao on 17-8-3.
 */
public class Fibonacci {

    public int test(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else if(n ==2 ){
            return 1;
        }
        return test(n-1)+test(n-2);
    }

}
