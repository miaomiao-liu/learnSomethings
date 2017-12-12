package cn.edu.swpu.cins.learnSomethings.crazy;

/**
 * 测试类变量的初始化机制
 * Created by miaomiao on 17-9-27.
 */
public class PriceTest {

    public static void main(String[] args){

        //1.  -2.8
        System.out.println(Price.INSTANCE.currentPrice);
        //2.   17.2
        Price p = new Price(2.8);
        System.out.println(p.currentPrice);
    }
}
