package cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.removeLastKthNode;

import cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.DoubleNode;

/**
 * Created by miaomiao on 17-8-23.
 */
public class RemoveLastKtnDoubleNode {

    public DoubleNode removeLastKthNode(DoubleNode head,int lastKth){
        if(head == null || lastKth <= 0){
            return head;
        }
        DoubleNode cur = head;
        while (cur != null){
            lastKth--;
            cur = cur.next;
        }
        if(lastKth > 0){
            return head;
        }else if(lastKth == 0){
            head = head.next;
            head.last = null;
            return head;
        }else{
            cur = head;
            lastKth++;
            while (lastKth != 0){
                lastKth++;
                cur = cur.next;
            }
            cur.next = cur.next.next;
            if(cur.next.next != null){
                cur.next.next.last = cur;
            }
            return head;
        }
    }
}

//    public DoubleNode removeLastKthNode(DoubleNode head,int lastKth){
//        if(head == null || lastKth <= 0){
//            return head;
//        }
//        int count = 0;
//        DoubleNode cur = head;
//        while (cur != null){
//            count++;
//            cur = cur.next;
//        }
//
//        if(count < lastKth){
//            return head;
//        }else if(count == lastKth){
//            return head.next;
//        }else {
//            cur = head;
//            count--;
//            while (count != 0){
//                count--;
//                cur = cur.next;
//            }
//            while (--lastKth != 0){
//                cur = cur.last;
//            }
//            cur.next = cur.next.next;
//
//            if(cur.next.next != null){
//                cur.next.next.last = cur;
//            }
//            return head;
//        }
//    }
//}
