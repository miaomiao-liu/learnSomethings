package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.autowiredTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by miaomiao on 17-9-16.
 */
public class MianTestRelation {

    public static void main(String[] args){


        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("springShangGuiGu/beans-relation.xml");


//        Address address = (Address) cxt.getBean("address");
//        System.out.println(address);

        Address address2 = (Address) cxt.getBean("address2");
        System.out.println(address2);


        Person person = (Person) cxt.getBean("person");
        System.out.println(person);

    }
}
