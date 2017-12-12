package cn.edu.swpu.cins.learnSomethings.offer;

import java.util.ArrayList;

/**
 * Created by miaomiao on 17-9-24.
 */
public class PrintListFromTailToHead {
    ArrayList list = new ArrayList();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        if(listNode != null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.value);
        }
        return list;
    }

}
