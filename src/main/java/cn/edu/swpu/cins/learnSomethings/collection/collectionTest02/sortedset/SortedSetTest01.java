package cn.edu.swpu.cins.learnSomethings.collection.collectionTest02.sortedset;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet 不可重复，输出时元素按照大小自动排好序
 * Created by miaomiao on 17-10-29.
 */
public class SortedSetTest01 {

    public static void main(String[] args) throws ParseException {

        SortedSet ss = new TreeSet();

        ss.add(29);
        ss.add(32);
        ss.add(35);
        ss.add(14);
        ss.add(7);

        Iterator it = ss.iterator();

        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }

        SortedSet strs = new TreeSet();

        strs.add("mike");
        strs.add("jack");
        strs.add("cook");
        strs.add("marry");
        strs.add("coco");


        it = strs.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }


        String st1 = "2008-08-08";
        String st2 = "2008-09-08";
        String st3 = "2009-08-08";
        String st4 = "2007-07-08";
        String st5 = "2012-08-08";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        Date t1 = sdf.parse(st1);
        Date t2 = sdf.parse(st2);
        Date t3 = sdf.parse(st3);
        Date t4 = sdf.parse(st4);
        Date t5 = sdf.parse(st5);

        SortedSet times = new TreeSet();

        times.add(t1);
        times.add(t2);
        times.add(t3);
        times.add(t4);
        times.add(t5);


        it = times.iterator();
        while (it.hasNext()){
            Object o = it.next();
            if(o instanceof Date){
                Date d = (Date)o;
                System.out.println(sdf.format(d));
            }
        }


    }
}
