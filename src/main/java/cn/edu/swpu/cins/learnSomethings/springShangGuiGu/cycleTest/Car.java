package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.cycleTest;

/**
 * Created by miaomiao on 17-9-17.
 */
public class Car {
    private String brand;

    public void setBrand(String brand) {
        System.out.println("set brand...");
        this.brand = brand;
    }

    public Car(){
        System.out.println("Car's constructor...");
    }

    public void init(){
        System.out.println("init...");
    }

    public void destroy(){
        System.out.println("destroy...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
