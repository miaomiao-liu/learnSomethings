package cn.edu.swpu.cins.learnSomethings.collection.collectionTest02.sortedset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * SortedSet存储元素为什么可以实现自动排序？
 * 因为被实现的元素实现了Comparable接口，
 * 添加元素的时候会自动调用compareTo方法
 * 二叉树
 * Created by miaomiao on 17-10-29.
 */
public class SortedSetTest02 {
    public static void main(String[] args){

        SortedSet users = new TreeSet();
        User u1 = new User(14);
        User u2 = new User(25);
        User u3 = new User(35);
        User u4 = new User(13);
        User u5 = new User(10);

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

        Iterator it = users.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }
    }
}

class User implements Comparable{
    int age;

    public User(int age){
        this.age = age;
    }

    public String toString(){
        return "User[age = "+age+"]";
    }


    @Override
    public int compareTo(Object o) {
        int age1 = this.age;
        int age2 = ((User)o).age;
        return age1-age2;
    }
}