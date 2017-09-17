package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.cycleTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by miaomiao on 17-9-17.
 */
public class MyBeanPostProcesser implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization:"+ bean +" , "+ beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization:"+ bean +" , "+ beanName);
//        Car car =new Car();
//        car.setBrand("Ford");
//        return car;
        return bean;
    }
}
