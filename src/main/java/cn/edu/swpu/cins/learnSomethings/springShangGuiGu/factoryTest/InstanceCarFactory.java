package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.factoryTest;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法：先创建工厂实例再调用工厂方法来返回bean的实例
 * Created by miaomiao on 17-9-17.
 */
public class InstanceCarFactory {

    private Map<String,Car> cars = null;

    public InstanceCarFactory(){
        cars = new HashMap<>();
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",400000));
    }

    public Car getCar(String name){
        return cars.get(name);
    }
}
