package cn.edu.swpu.cins.learnSomethings.crazy;

/**
 * Created by miaomiao on 17-9-27.
 */
public class Price {

    final static Price INSTANCE = new Price(2.8);

    static double initPrice = 20;

    double currentPrice;

    public Price(double discount){

        currentPrice = initPrice - discount;

    }
}
