package cn.edu.swpu.cins.learnSomethings.java8.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by miaomiao on 17-7-21.
 */
public class TestLambda1 {

   List<Employee> employees = Arrays.asList(
           new Employee("张三",38,999.34),
           new Employee("李四",18,9789.37),
           new Employee("王五",8,9934.39),
           new Employee("赵六",17,3579.34),
           new Employee("田七",50,379.34)
           );

   //获取当前员工中年龄大于35岁的员工的信息
   public List<Employee> filterEmploeeByAge(List<Employee> list){
       List<Employee> emps = new ArrayList<Employee>();
       for(Employee emp : list){
           if(emp.getAge() > 35){
               emps.add(emp);
           }
       }
       return emps;
   }



    @Test
   public void test1(){
       List<Employee> list = filterEmploeeByAge(employees);
       for (Employee emp: list) {
           System.out.println(emp);
       }
   }

   public List<Employee> filterEmploee(List<Employee> list,MyPredicate<Employee> mp){

       List<Employee> emps = new ArrayList<Employee>();
       for (Employee emp: list ) {
           if(mp.test(emp))
               emps.add(emp);
       }
       return emps;
   }

   //匿名内部类
   @Test
    public void test2(){
       List<Employee> list = filterEmploee(employees, new MyPredicate<Employee>() {
           @Override
           public boolean test(Employee employee) {
               return employee.getAge() >= 35;
           }
       });

       for(Employee emp : list){

           System.out.println(emp);
       }
   }

   //Lambda表达式
    @Test
    public void test3(){
        List<Employee> list = filterEmploee(employees,(e) -> e.getAge() >= 35);
        list.forEach(System.out :: println);
    }

    //stream API
    @Test
    public void test4(){
        employees.stream()
                .filter((e) -> e.getAge()>35)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");

        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
