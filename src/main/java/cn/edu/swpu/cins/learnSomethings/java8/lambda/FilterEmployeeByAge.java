package cn.edu.swpu.cins.learnSomethings.java8.lambda;

/**
 * Created by miaomiao on 17-7-22.
 */

public class FilterEmployeeByAge implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee t) {
        return t.getAge() >= 35;
    }
}
