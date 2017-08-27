package cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.reversePart;

import cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.Node;

/**
 * 反转部分单向链表
 * Created by miaomiao on 17-8-26.
 */
public class ReversePart {

    public Node reversePart(Node head,int from,int to){
        int len = 0;
        Node node1 = head;
        Node fPre = null;
        Node tPos = null;

        while(node1 != null){
            len++;
            fPre = len == from - 1 ? node1 : fPre;
            tPos = len == to + 1 ? node1 : tPos;
            node1 = node1.next;
        }

        if(from < 1 || to < from || len < to){
            return head;
        }

        node1 = fPre == null ? head : fPre.next;
        Node node2 = node1.next;
        node1.next = tPos;
        Node next = null;
        while (node2 != tPos){
            next = node2.next;
            node2.next = node1;
            node2 = node1;
            node1 = next;
        }

        if(fPre != null){
            fPre.next = node1;
            return head;
        }
        return node1;
    }


//    public Node reversePart(Node head,int from,int to){
//        int count = 0;
//        Node cur = head;
//        Node pre = null;
//        Node next = null;
//        while (cur != null){
//            cur = cur.next;
//            count++;
//        }
//        count = from - to + 1;
//        if(from < 1 || to < from || count < to){
//            return head;
//        }
//
//        //反转部分的前一个节点
//        pre = head;
//        from--;
//        while (--from != 0){
//            cur = cur.next;
//        }
//
//        //反转部分的后一个节点
//        next = head;
//        while (to != 0){
//            next = next.next;
//            to--;
//        }
//
//        Node node1 = null;
//        Node node2 = null;
//        while (count != 0){
//            next = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//            count--;
//        }
//
//        return  ;
//    }
}
