package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.aopImpl;

import org.springframework.stereotype.Component;

/**
 * Created by miaomiao on 17-9-18.
 */
@Component
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {


    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mut(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        return result;
    }
}
