package cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.removeNode;

import cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.Node;

/**
 * Created by miaomiao on 17-8-24.
 */
public class RemoveByRatio {

    public Node removeByRatio(Node head, int a,int b) {
        if (a / b == 0 || a / b > 1) {
            return head;
        }
        int count = 0;
        Node cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        //删除第几个节点
        int remove;
        if ((a * count) % b == 0) {
            remove = (a * count) / b - 1;
        } else {
            remove = (a * count) / b;
        }
        //删除节点
        if (remove == 0) {
            return head.next;
        } else {
            cur = head;
            while (--remove != 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            return head;
        }
    }


    public Node removeByRatio1(Node head, int a,int b){
        if(a < 1 || a > b){
            return head;
        }

        int n = 0;
        Node cur = head;
        while (cur != null){
            n ++;
            cur = cur.next;
        }

        //除运算以后向上取整
        n = (int)Math.ceil((double) (a*n)/(double) b);
        if (n == 1){
            head = head.next;
        }
        if(n > 1){
            cur = head;
            while (--n != 1){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }
}
