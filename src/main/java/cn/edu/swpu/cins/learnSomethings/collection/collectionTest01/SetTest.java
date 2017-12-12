package cn.edu.swpu.cins.learnSomethings.collection.collectionTest01;

import java.util.*;

/**
 * Created by miaomiao on 17-7-22.
 */
public class SetTest {
    private    List<Course> coursesToSelect;

    public SetTest(){

        coursesToSelect = new ArrayList<Course>();
    }

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

    public void testForEach(){
        System.out.println("有如下课程（通过foreach方法）:");
        for(Object obj : coursesToSelect){
            Course cr = (Course) obj;
            System.out.println(cr.getId()+cr.getName());
        }
    }
    public void testForEachForSet(Student student){
        for(Object obj : student.getCourse()){
            Course cr= (Course) obj;
            System.out.println("选择了课程:"+cr.getId()+cr.getName());
        }
    }



    public static void main(String[] args){
        SetTest st = new SetTest();
        st.testAdd();
        st.testForEach();
        System.out.println(2.0-1.1);
//
//        Student student = new Student(1,"小明");
//        Scanner scanner = new Scanner(System.in);
//        for(int i=0; i<3; i++){
//            System.out.println("请输入选课ID：");
//            int id = scanner.nextInt();
//            for (Course cr : st.coursesToSelect){
//                if(cr.getId()==(id)){
//                    student.getCourse().add(cr);
//                }
//            }
//        }
//        st.testForEachForSet(student);
    }
}
