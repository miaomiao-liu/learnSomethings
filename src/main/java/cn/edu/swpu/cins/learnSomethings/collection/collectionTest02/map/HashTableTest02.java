package cn.edu.swpu.cins.learnSomethings.collection.collectionTest02.map;

import java.util.Properties;

/**
 * hashTable的默认初始容量是11,加载因子0.75
 * HashTable的properties实现类,key和value都是字符串
 * Created by miaomiao on 17-10-29.
 */
public class HashTableTest02 {

    public static void main(String[] args){
        Properties p = new Properties();

        p.setProperty("username","miaomiao");
        p.setProperty("password","1234567");
        p.setProperty("email","1242019260@qq.com");


        String v1 = p.getProperty("username");
        String v2 = p.getProperty("password");
        String v3 = p.getProperty("email");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }



}
