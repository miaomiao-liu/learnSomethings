package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.beansFirstTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by miaomiao on 17-9-16.
 */
public class MainTestProperties {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("springShangGuiGu/beans-properties.xml");

        DataSource dataSource = (DataSource) cxt.getBean("properties");
        System.out.print(dataSource);
    }
}
