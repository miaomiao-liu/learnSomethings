package cn.edu.swpu.cins.learnSomethings.springShangguigu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by miaomiao on 17-9-13.
 */
public class Main {

    public static void main(String[] args){

        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("springShangguigu.xml");

        Car car = (Car) cxt.getBean("car");
        System.out.println(car);


        Car car2 = (Car) cxt.getBean("car2");
        System.out.println(car2);

        Person person = (Person) cxt.getBean("person");
        System.out.println(person);

        Person person2 = (Person) cxt.getBean("person2");
        System.out.println(person2);

        PersonCars person3 = (PersonCars) cxt.getBean("person3");
        System.out.println(person3);

    }
}
