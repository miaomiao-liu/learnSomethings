package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.autowiredTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by miaomiao on 17-9-16.
 */
public class MainTestScope {


    public static void main(String[] args) {


        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("springShangGuiGu/beans-scope.xml");

        Car car = (Car) cxt.getBean("car");
        Car car2 = (Car) cxt.getBean("car");
        System.out.println(car == car2);

        Car car3 = (Car) cxt.getBean("car2");
        Car car4 = (Car) cxt.getBean("car2");
        System.out.println(car3 == car4);
    }
}
