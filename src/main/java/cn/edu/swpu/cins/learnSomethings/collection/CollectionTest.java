package cn.edu.swpu.cins.learnSomethings.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by miaomiao on 17-7-24.
 */
public class CollectionTest {
    /**
     * collection.sort()方法：
     * 根据元素的自然顺序，对列表中的元素进行升序排序，列表中所有元素都必须实现Comparable接口
     * Comparable和Comparator：
     * Comparable：默认比较规则，必须实现compareTo()方法
     * Comparator：临时比较规则,必须实现compare()方法，比较工具接口
     */

    /**
     * 1）对int类型的List进行排序
     */
    public void testSort1(){
        List<Integer> integerList = new ArrayList<Integer>();
        Random random = new Random();
        Integer k;
        for(int i=0; i<10; i++){
            do{
                k=random.nextInt(100);
            }while (integerList.contains(k));
            integerList.add(k);
            System.out.println("成功加入整数："+k);
        }

        System.out.println("----------排序前------------");
        for (Integer integer:integerList){
            System.out.println("元素："+integer);
        }

        Collections.sort(integerList);    //排序    collections？
        System.out.println("----------排序后------------");
        for (Integer integer:integerList){
            System.out.println("元素："+integer);
        }

    }

    /**
     * 2)对String类型的List进行排序
     *  排列顺序：数字 大写字母 小写字母
     */
    public void testSort2(){
        List<String> stringList = new ArrayList<String>();
        stringList.add("hello");
        stringList.add("miaomiao");
        stringList.add("hahahahaha");

        System.out.println("----------排序前------------");
        for (String string:stringList){
            System.out.println("元素："+string);
        }
        Collections.sort(stringList);
        System.out.println("----------排序后------------");
        for (String string:stringList){
            System.out.println("元素："+string);
        }
    }

    /**
     *
     * 3) 对String类型的List进行排序 2
     * 加十条随机字符串，每条字符串的长度为10以内的随机整数
     * 字符可以重复，字符串不可以重复
     */
    public void testSort3(){
        List<String> stringList = new ArrayList<>();
        String base = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        Random random = new Random();
        int k,h;
        System.out.println("-------------------------------");
        //循环添加十条随机字符串
        for (int j=0; j<10; j++) {
            StringBuffer sb = new StringBuffer();
            k = random.nextInt(10);
            do{
            //生成一条随机字符串
            for (int i = 0; i < k; i++) {
               h = random.nextInt(base.length());
               sb.append(base.charAt(h));
            }
            } while (stringList.contains(sb));
            stringList.add(sb.toString());
            System.out.println("成功添加字符串："+sb.toString());
        }

        System.out.println("----------排序前------------");
        for (String string:stringList){
            System.out.println("元素："+string);
        }
        Collections.sort(stringList);
        System.out.println("----------排序后------------");
        for (String string:stringList){
            System.out.println("元素："+string);
        }
    }

    /**
     *对学生进行排序
     */
    public void testSort4(){

        List<Student> studentList = new ArrayList<>();
        Random random = new Random();
        studentList.add(new Student(random.nextInt(1000),"wzy"));
        studentList.add(new Student(random.nextInt(1000), "muyi"));
        studentList.add(new Student(random.nextInt(1000), "miaomiao"));
        System.out.println("---------------排序前----------------");
        for (Student student:studentList){
            System.out.println("元素："+student);
        }

        Collections.sort(studentList);
        System.out.println("---------------排序后----------------");
        for (Student student:studentList){
            System.out.println("元素："+student);
        }
    }

    public static void main(String[] args){
        CollectionTest ct = new CollectionTest();
        ct.testSort1();
        ct.testSort2();
        ct.testSort3();
        ct.testSort4();
    }
}
