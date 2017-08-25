package cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.removeNode;

import cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.Node;

/**
 * Created by miaomiao on 17-8-24.
 */
public class RemoveMidNode {

    public Node removeMidNode(Node head){
        int count = 0;
        Node cur = head;
        while (cur != null){
            count ++;
            cur = cur.next;
        }

        if(count == 0 || count ==1 ){
            return head;
        }else if(count == 2){
            return head.next;
        }else if(count % 2 ==0){
            int remove = (count % 2) -1;
            cur = head;
            while (--count != 0){
                cur = cur.next;
            }
            cur.next = cur.next.next;
            return head;
        }else {
            int remove = count % 2;
            cur = head;
            while (--count != 0){
                cur = cur.next;
            }
            cur.next = cur.next.next;
            return head;
        }
    }


    public Node removeMidNode1(Node head){
        if(head == null && head.next == null){
            return head;
        }
        if(head.next.next == null){
            return head.next;
        }
        Node pre = head;
        Node cur = head.next.next;
        while (cur.next != null && cur.next.next !=null){
            pre = pre.next;
            cur = cur.next.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
