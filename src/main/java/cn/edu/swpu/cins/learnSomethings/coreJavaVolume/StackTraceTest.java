package cn.edu.swpu.cins.learnSomethings.coreJavaVolume;

import java.util.Scanner;

/**
 * 分析堆栈轨迹
 * Created by miaomiao on 17-9-1.
 */
public class StackTraceTest {

    public static int factorial(int n){
        System.out.println("factorial("+ n +"):");
        Throwable t = new Throwable();
        StackTraceElement[] frams = t.getStackTrace();
        for (StackTraceElement f : frams){
            System.out.println(f);
        }
        int r;
        if(n <= 1) r=1;
        else r = n * factorial(n-1);
        System.out.println("return " +r);
        return r;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = in.nextInt();
        factorial(n);
    }
}
