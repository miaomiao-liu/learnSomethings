package cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.reverseList;

import cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.DoubleNode;

/**
 * 反转双向链表
 * Created by miaomiao on 17-8-25.
 */
public class ReverseDoubleList {

    public DoubleNode reverseDoubleList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }
}
