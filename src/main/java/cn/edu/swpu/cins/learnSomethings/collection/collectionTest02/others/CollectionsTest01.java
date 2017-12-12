package cn.edu.swpu.cins.learnSomethings.collection.collectionTest02.others;

import java.util.*;

/**
 * others 工具类
 * Created by miaomiao on 17-10-29.
 */
public class CollectionsTest01 {

    public static void main(String[] args){
        List l = new ArrayList();
        l.add(20);
        l.add(3);
        l.add(34);
        l.add(29);

        //排序
        Collections.sort(l);

        for(Iterator it = l.iterator();it.hasNext();){
            System.out.println(it.next());
        }

        Set set = new HashSet();
        set.add(13);
        set.add(6);
        set.add(23);
        set.add(5);

//        对set进行排序
//        Collections.sort(set);不能这样用

        //把set转化为list
        List list = new ArrayList(set);
        Collections.sort(list);
        for(Iterator it = list.iterator();it.hasNext();){
            System.out.println(it.next());
        }

    }

}
