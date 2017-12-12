package cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList;


/**
 * Created by miaomiao on 17-10-28.
 */
public class LinkedList<E> {

    public Entry entry;

    private transient Entry header = new Entry(null,null,null);

    public LinkedList(){
        header.next = header.previous = header;
    }

    //方法。。。

    private static class Entry<E>{

        Object data;
        Entry<E> previous;
        Entry<E> next;

        Entry(Entry<E> previous,Object data,Entry<E> next){}

    }
}
