package cn.edu.swpu.cins.learnSomethings.java8.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by miaomiao on 17-7-25.
 */
public class TestLambda {

    List<Employee> employees = Arrays.asList(
            new Employee("张三",38,999.34),
            new Employee("李四",18,9789.37),
            new Employee("王五",8,9934.39),
            new Employee("赵六",17,3579.34),
            new Employee("田七",50,379.34)
    );

    @Test
    public void test1(){
        Collections.sort(employees,(e1,e2) -> {
            if(e1.getAge()==e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else {
                return Integer.compare(e1.getAge(),e2.getAge());
            }
        });

        for(Employee emp :employees){
            System.out.println(emp);
        }
    }

    @Test
    public void test2(){
        System.out.println("\t\t\t hello miaomiao");
        String trimStr = strHander("\t\t\t hello miaomiao",str -> str.trim());
        System.out.println(trimStr);

        String upper = strHander("miaomiao",str -> str.toUpperCase());
        System.out.println(upper);
    }

    //处理字符串
    public String strHander(String str,MyFunction mf){
        return mf.getValue(str);
    }


    @Test
    public void test3(){
        op(100L,200L,(x,y)-> x+y);
        op(100L,200L,(x,y)-> x*y);
    }
    //对于两个long型数据进行处理class
    public void op(Long l1,Long l2, MyFunction2<Long,Long> mf){
        System.out.println(mf.getValue(l1,l2));
    }
}
