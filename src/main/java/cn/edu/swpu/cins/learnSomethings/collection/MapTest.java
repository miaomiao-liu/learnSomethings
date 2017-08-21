package cn.edu.swpu.cins.learnSomethings.collection;

import java.util.*;

/**
 * Created by miaomiao on 17-7-21.
 */
public class MapTest {
    private Map<Integer, Student> student;

    public MapTest() {
        this.student = new HashMap<Integer, Student>();
    }

    public void testPut() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入学生的ID：");
            int ID = scanner.nextInt();

            Student st = student.get(ID);
            if (st == null) {
                System.out.println("没有你所查找的学生，请创建一个学生，输入学生姓名：");
                Scanner scanner1 = new Scanner(System.in);
                String name = scanner1.next();
                Student newStudent = new Student(ID, name);
                student.put(ID, newStudent);
                System.out.println("添加学生成功，学生为：" + newStudent.getId() + newStudent.getName());
                i++;
            }else {
                System.out.println("该学生Id已被占用！");
            }
            continue;
        }
    }



    //通过keySet方法来遍历Map
    public void testKeySet(){
        Set<Integer> keySet = student.keySet();
        for (int stuId : keySet){
            Student st =student.get(stuId);

            if(st!=null)
                System.out.println("学生："+st.getId()+st.getName());
        }
    }

    //删除对应ID的学生
    public void testRemove(){
        while (true) {
            System.out.println("请输入删除学生的ID：");
            Scanner scanner = new Scanner(System.in);
            int ID = scanner.nextInt();
            Student st = student.get(ID);
            if(st==null){
                System.out.println("输入的ID不存在");
                continue;
            }
            student.remove(ID);
            System.out.println("成功删除学生："+st.getName());
            break;
        }

    }

    //通过entrySet方法来遍历Map
    public void testEntrySet(){
        Set<Map.Entry<Integer,Student>> entrySet = student.entrySet();
        for (Map.Entry<Integer,Student> entry: entrySet) {
            System.out.println("键值对为："+entry.getKey()+" / "+entry.getValue().getName());
        }
    }

    //利用put方法修改map中的映射
    public void testModify(){
        System.out.println("请输入修改学生的ID：");
        while(true){
        Scanner scanner = new Scanner(System.in);
        int ID = scanner.nextInt();
        Student st = student.get(ID);
        if(st ==null){
            System.out.println("该学生ID不存在，请重新输入：");
            continue;
        }
        System.out.println("输入ID所对应的学生为："+st.getName()+"请输入修改后学生姓名:");

        String name = scanner.next();
        st.setName(name);
        student.put(ID,st);
        System.out.println("修改学生成功，修改后学生信息为："+st.getId()+st.getName());
        break;
      }
    }

    public void testContainsKeyOrValue(){
        System.out.println("请输入学生的ID:");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println("你输入的学生ID为："+id+"在学生映射表中是否存在："+student.containsKey(id));
        if(student.containsKey(id))
            System.out.println("对应的学生为："+student.get(id).getName());

        System.out.println("请输入学生的姓名：");
        String name = scanner.next();
        System.out.println("你输入的学生姓名为："+name+"在学生映射表中是否存在："+student.containsValue(new Student(0,name)));

    }

    public static  void main(String[] args){

        MapTest mt = new MapTest();
        mt.testPut();
        mt.testKeySet();
//        mt.testRemove();
//        mt.testEntrySet();
//        mt.testModify();
        mt.testEntrySet();
        mt.testContainsKeyOrValue();
    }
}
