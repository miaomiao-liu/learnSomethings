package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.factoryTest;

import org.springframework.beans.factory.FactoryBean;

/**
 * 自定义的FactoryBean需要实现FactoryBean接口
 * Created by miaomiao on 17-9-17.
 */
public class CarFactoryBean implements FactoryBean<Car> {

    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public Car getObject() throws Exception {
        return new Car(brand,500000);
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
