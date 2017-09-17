package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.factoryTest;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *静态工厂方法：直接调用某一个类的静态方法就可以返回bean实例
 * Created by miaomiao on 17-9-17.
 */
public class StaticCarFactory {

    public static Map<String,Car> cars = new HashMap<>();

    static {
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",400000));
    }

    //静态工程方法
    public static Car getCar(String name){
        return cars.get(name);
    }
}
