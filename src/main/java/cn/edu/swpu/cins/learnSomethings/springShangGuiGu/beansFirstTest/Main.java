package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.beansFirstTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by miaomiao on 17-9-13.
 */
public class Main {

    public static void main(String[] args){

        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("springShangGuiGu/springShangguigu.xml");

        Car car = (Car) cxt.getBean("car");
        System.out.println(car);


        Car car2 = (Car) cxt.getBean("car2");
        System.out.println(car2);

        Person person = (Person) cxt.getBean("person");
        System.out.println(person);

        Person person2 = (Person) cxt.getBean("person2");
        System.out.println(person2);

        PersonCars personCars = (PersonCars) cxt.getBean("personCars");
        System.out.println(personCars);

        PersonCarMap personCarMap= (PersonCarMap) cxt.getBean("personCarMap");
        System.out.println(personCarMap);

        DataSource dataSource = cxt.getBean(DataSource.class);
        System.out.println(dataSource);

        PersonCars person3 = (PersonCars) cxt.getBean("Person3");
        System.out.println(person3);

        PersonCars person4 = (PersonCars) cxt.getBean("Person4");
        System.out.println(person4);

    }
}
