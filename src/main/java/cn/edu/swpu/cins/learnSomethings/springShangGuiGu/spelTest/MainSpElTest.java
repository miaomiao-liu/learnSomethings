package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.spelTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SpEl 表达式的运用
 * Created by miaomiao on 17-9-17.
 */
public class MainSpElTest {

    public static void main(String[] args){

        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("springShangGuiGu/beans-spel.xml");


        Address address = (Address) cxt.getBean("address");
        System.out.println(address);

        Car car = (Car) cxt.getBean("car");
        System.out.println(car);

        Person person = (Person) cxt.getBean("person");
        System.out.println(person);


    }
}
