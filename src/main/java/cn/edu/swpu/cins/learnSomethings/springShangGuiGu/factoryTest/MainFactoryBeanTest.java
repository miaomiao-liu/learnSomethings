package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.factoryTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring通过FacctoryBean来配置bean
 * Created by miaomiao on 17-9-17.
 */
public class MainFactoryBeanTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("springShangGuiGu/beans-factorybean.xml");

        Car car = (Car) cxt.getBean("car");
        System.out.println(car);
    }
}
