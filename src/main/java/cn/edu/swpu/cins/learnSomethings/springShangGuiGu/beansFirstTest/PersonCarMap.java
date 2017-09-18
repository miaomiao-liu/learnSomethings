package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.beansFirstTest;

import java.util.Map;

/**
 * Created by miaomiao on 17-9-13.
 */
public class PersonCarMap {
    private String name;
    private int age;
    private Map<String, Car> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "PersonCarMap{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
