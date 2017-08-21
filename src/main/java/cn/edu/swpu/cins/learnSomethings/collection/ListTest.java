package cn.edu.swpu.cins.learnSomethings.collection;

import java.util.*;

/**
 * Created by miaomiao on 17-7-21.
 */
public class ListTest {

    private List coursesToSelect;
    private Scanner scanner;

    public ListTest(){
         this.coursesToSelect = new ArrayList();
         this.scanner = new Scanner(System.in);

    }

    //添加课程
    public void testAdd(){
        Course cr1 = new Course(1,"数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course)coursesToSelect.get(0);
        System.out.println("课程id为："+temp.getId()+" / 课程名为："+temp.getName());

        Course cr2 = new Course(2,"C语言");
        coursesToSelect.add(0,cr2);
        Course temp1 = (Course) coursesToSelect.get(0);
        System.out.println("课程id为："+temp1.getId()+" / 课程名为："+temp1.getName());


        Course[] course1 = {new Course(3,"离散数学"),new Course(4,"汇编语言")};
        coursesToSelect.addAll(Arrays.asList(course1));
        Course temp2 = (Course) coursesToSelect.get(2);
        Course temp3 = (Course) coursesToSelect.get(3);
        System.out.println("课程为："+temp2.getId()+temp2.getName()+" 和 "+temp3.getId()+temp3.getName());

    }

    //用get方法查看List中的对象
    public void testGet(){
        int size = coursesToSelect.size();
        System.out.println("List中的课程为：");
        for(int i = 0 ; i<size ; i++){
            Course temp0 = (Course) coursesToSelect.get(i);
            System.out.println(temp0.getId()+temp0.getName());
        }

    }

    /**
     *通过迭代器遍历数组
     **/
    public void testIterater(){
        Iterator it = coursesToSelect.iterator();
        System.out.println("通过迭代器遍历List中的课程：");
        while(it.hasNext()){
            Course cr = (Course)it.next();
            System.out.println(cr.getId()+cr.getName());
        }
    }

    public void testForEach(){
        System.out.println("有如下课程（通过foreach方法）:");
        for(Object obj : coursesToSelect){
            Course cr = (Course) obj;
            System.out.println(cr.getId()+cr.getName());
        }
    }

    //修改
    public void testModify(){
        coursesToSelect.set(2,new Course(7,"毛概"));
    }

    //删除 remove()  removeAll(集合)：从集合中删除一个小的集合
    public void testRemove(){
        Course cr = (Course) coursesToSelect.get(1);
        System.out.println("我是课程："+cr.getId()+cr.getName()+"我即将被删除");
        coursesToSelect.remove(cr);
        testIterater();
    }

    //List中是否包含某个对象
    public void testListContains(){
        //从List中提取的对象
        Course course = (Course) coursesToSelect.get(1);
        System.out.println("提取课程为:"+course.getName());
        System.out.println("备选课程中是否包含该课程？"+coursesToSelect.contains(course));

        //根据List中的对象新创建的对象
        System.out.println("请输入课程名");
        String name = scanner.next();
        Course course1 = new Course(course.getId(),name);
        System.out.println("课程为:"+course1.getName());
        System.out.println("备选课程中是否包含该课程？"+coursesToSelect.contains(course1));

        if(coursesToSelect.contains(course1));
        {
            System.out.println("该课程索引位置为："+coursesToSelect.indexOf(course1));
        }
    }


    public static void main(String[] args){
        ListTest t1 = new ListTest();
        t1.testAdd();
        t1.testGet();
//        t1.testIterater();
//        t1.testModify();
//        t1.testIterater();
        t1.testRemove();
        t1.testListContains();
        t1.testIterater();
    }


}
