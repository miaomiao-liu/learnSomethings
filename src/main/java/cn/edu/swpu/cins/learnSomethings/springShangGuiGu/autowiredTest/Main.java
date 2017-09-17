package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.autowiredTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by miaomiao on 17-9-15.
 */
public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("springShangGuiGu/beans-autowire.xml");

        Person person = (Person) cxt.getBean("Person");
        System.out.println(person);

    }
}
