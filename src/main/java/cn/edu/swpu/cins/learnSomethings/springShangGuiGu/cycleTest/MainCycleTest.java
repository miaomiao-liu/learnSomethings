package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.cycleTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean生命周期的流程
 * Created by miaomiao on 17-9-17.
 */
public class MainCycleTest {

    public static void main(String[] args){

        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("springShangGuiGu/beans-cycle.xml");

        Car car = (Car) cxt.getBean("car");
        System.out.println(car);

        cxt.close();
    }
}
