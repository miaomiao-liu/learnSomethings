package cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.removeLastKthNode;

import cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.Node;

/**
 * Created by miaomiao on 17-8-23.
 */
public class RemoveLastKthSingleNode {
    public Node removeLastKthNode(Node head,int lastKth){
        if(head == null || lastKth <= 0){
            return head;
        }
        Node cur = head;
        while (cur != null){
            lastKth--;
            cur = cur.next;
        }
        if(lastKth > 0){
            return head;
        }else if(lastKth == 0){
            return head.next;
        }else{
            cur = head;
            lastKth++;
            while (lastKth != 0){
                lastKth++;
                cur = cur.next;
            }
            cur.next = cur.next.next;
            return head;
        }
    }
}
