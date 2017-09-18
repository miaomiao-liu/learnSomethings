package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.beansFirstTest;

import java.util.List;

/**
 * 为了xml配置集合属性
 * Created by miaomiao on 17-9-13.
 */
public class PersonCars {

    private String name;
    private int age;
    private List<Car> cars;

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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public PersonCars(String name, int age, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    public PersonCars() {
    }

    @Override
    public String toString() {
        return "PersonCars{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
