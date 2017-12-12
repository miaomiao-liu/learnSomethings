package cn.edu.swpu.cins.learnSomethings.collection.collectionTest02.map;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by miaomiao on 17-10-29.
 */
public class SortedMapTest03 {
    public static void main(String[] args){

        SortedMap products = new TreeMap();

        Product p1 = new Product("西瓜",1.0);
        Product p2 = new Product("苹果",7.0);
        Product p3 = new Product("桃子",4.0);
        Product p4 = new Product("柚子",3.0);

        products.put(p1,8.0);
        products.put(p2,2.0);
        products.put(p3,5.0);
        products.put(p4,3.0);

        Set set = products.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Object k = it.next();
            Object v = products.get(k);
            System.out.println(k+"---->"+v);
        }
    }
}

class Product implements Comparable{

    String name;
    double price;

    Product(String name,double price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Product[name = "+name+"price = "+price+"]";
    }

    @Override
    public int compareTo(Object o) {

        double price1 = this.price;
        double price2 = ((Product)o).price;

        if(price1 == price2){
            return 0;
        }else if(price1 > price2){
            return -1;
        }else {
            return 1;
        }

    }
}