package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.aopImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by miaomiao on 17-9-18.
 */
public class Main {

    public static void main(String[] args){

        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("springShangGuiGu/application-aop.xml");

        ArithmeticCalculator arithmeticCalculator = cxt.getBean(ArithmeticCalculator.class);

        int result = arithmeticCalculator.add(3,6);
        System.out.println("result :"+ result);

        int result1 = arithmeticCalculator.div(6,2);
        System.out.println("result :"+ result1);
    }
}
