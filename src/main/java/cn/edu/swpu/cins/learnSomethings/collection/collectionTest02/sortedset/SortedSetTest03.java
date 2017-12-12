package cn.edu.swpu.cins.learnSomethings.collection.collectionTest02.sortedset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 另一种方式：Comparator
 * 单独编写一个比较器
 * Created by miaomiao on 17-10-29.
 */
public class SortedSetTest03 {

    public static void main(String[] args){

        //匿名内部类：比较器无法得到重用
        //可以分离出来
        SortedSet products = new TreeSet(new Comparator(){
            public int compare(Object o1, Object o2) {
                double price1 = ((Product)o1).price;
                double price2 = ((Product)o2).price;

                if(price1 == price2){
                    return 0;
                }else if(price1 > price2){
                    return 1;
                }else {
                    return -1;
                }
            }
        });

        Product p1 = new Product(2.9);
        Product p2 = new Product(4.3);
        Product p3 = new Product(2.4);
        Product p4 = new Product(1.6);
        Product p5 = new Product(6.4);

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        Iterator it = products.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Product{

    double price;
    Product(double price){
        this.price = price;
    }

    public String toString(){
        return price + " ";
    }
}

//class ProductComparater implements Comparator{
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        double price1 = ((Product)o1).price;
//        double price2 = ((Product)o2).price;
//
//        if(price1 == price2){
//            return 0;
//        }else if(price1 > price2){
//            return 1;
//        }else {
//            return -1;
//        }
//    }
//}
