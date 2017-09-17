package cn.edu.swpu.cins.learnSomethings.springShangGuiGu.spelTest;

/**
 * Created by miaomiao on 17-9-15.
 */
public class Car {
    private String brand;
    private double price;
    private double tyrePerimrter;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTyrePerimrter() {
        return tyrePerimrter;
    }

    public void setTyrePerimrter(double tyrePerimrter) {
        this.tyrePerimrter = tyrePerimrter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", tyrePerimrter=" + tyrePerimrter +
                '}';
    }
}
