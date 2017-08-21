package cn.edu.swpu.cins.learnSomethings.dataStructure.stackQueue;

import java.util.Stack;

/**
 * Created by miaomiao on 17-8-17.
 */
public class ReverseStack {
//    private Stack<Integer> stack = new Stack<Integer>();

    //递归获取并移除底部元素
    public int getAndRemoveLastElement(Stack<Integer> stack){
        int result = stack.pop();
        if(stack.isEmpty()){
            return result;
        }else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    //逆序
    public void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

    public static void main(String[] args){
        ReverseStack reverseStack = new ReverseStack();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverseStack.reverse(stack);
        System.out.println(stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
