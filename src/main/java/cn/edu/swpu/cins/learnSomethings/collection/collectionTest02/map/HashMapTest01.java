package cn.edu.swpu.cins.learnSomethings.collection.collectionTest02.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * map中的key要是重复，后面加入的键值对的value值会覆盖之前的value值
 * Created by miaomiao on 17-10-29.
 */
public class HashMapTest01 {

    public static void main(String[] args){

        Map persons = new HashMap();

        persons.put("1000","jack");
        persons.put("1001","jim");
        persons.put("1002","coco");
        persons.put("1003","marry");
        persons.put("1004","king");
        persons.put("1000","lucy");

        System.out.println(persons.size());

        System.out.println(persons.containsValue("lucy"));

        //将map转换成set集合，元素是原key和value的组合形式
        Set entrySet = persons.entrySet();
        Iterator it = entrySet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
