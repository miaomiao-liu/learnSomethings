package cn.edu.swpu.cins.learnSomethings.collection;

import cn.edu.swpu.cins.learnSomethings.aspect.LogAspect;
import org.apache.catalina.core.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miaomiao on 17-7-21.
 */
public class TestGeneric {
    private List<Course> courses;

    public TestGeneric(){
        this.courses = new ArrayList<Course>();
    }

    public void testAdd(){
        Course cr = new Course(1,"大学语文");
        courses.add(cr);
        Course cr1 = new Course(2,"java基础课程");
        courses.add(cr1);
    }

    public void testForEach(){
        for(Course cr : courses){
            System.out.println(cr.getId()+cr.getName());
        }
    }

    public static  void main(String[] args){

        TestGeneric tg = new TestGeneric();
        tg.testAdd();
        tg.testForEach();
    }

}
