package cn.edu.swpu.cins.learnSomethings.dataStructure.linkedList.CommonPart;

/**
 * Created by miaomiao on 17-8-21.
 */
public class CommonPart {

    public void printCommonPart(Node head1,Node head2){
        System.out.println("common part :");
        while (head1 != null && head2 != null){
            if (head1.value < head2.value){
                head1 = head1.next;
            }else if(head1.value > head2.value){
                head2 = head2.next;
            }else {
                System.out.println(head1.value+" ");
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        System.out.println("no common part");
    }

    //创建有序链表  添加节点？
    public static void main(String[] args){
        CommonPart commonPart = new CommonPart();
        Node head1 = new Node(1);
//        head1.next.value = 4;
//        head1.next.value = 5;
//        head1.next.value = 9;
//        head1.next.value = 11;
        Node head2 = new Node(2);
//        head2.next.value = 2;
//        head2.next.value = 5;
//        head2.next.value = 6;
//        head2.next.value = 8;
//        head2.next.value = 11;
//        head2.next.value = 13;
//        head2.next.value = 19;

        commonPart.printCommonPart(head1,head2);
    }
}
