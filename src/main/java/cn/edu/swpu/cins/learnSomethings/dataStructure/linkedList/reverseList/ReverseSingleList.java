package cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.reverseList;

import cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.Node;

/**
 * Created by miaomiao on 17-8-25.
 */
public class ReverseSingleList {
    public Node reverseList(Node head){
        Node pre = null;
        Node next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
