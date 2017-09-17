package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.factoryTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Created by miaomiao on 17-9-17.
 */
public class MainFactoryTest {

    public static void main(String[] args){

        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("springShangGuiGu/beans-factory.xml");

        Car car = (Car) cxt.getBean("car");
        System.out.println(car);

        Car car2 = (Car) cxt.getBean("car2");
        System.out.println(car2);
    }
}
