package cn.edu.swpu.cins.learnSomethings.collection.collectionTest01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miaomiao on 17-7-21.
 */
public class GenericTest {
    private List<Course> courses;

    public GenericTest(){
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

        GenericTest tg = new GenericTest();
        tg.testAdd();
        tg.testForEach();
    }

}
