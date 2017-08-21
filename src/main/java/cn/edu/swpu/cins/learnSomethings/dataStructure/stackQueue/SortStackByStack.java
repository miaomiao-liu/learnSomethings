package cn.edu.swpu.cins.learnSomethings.dataStructure.stackQueue;

import java.util.Stack;

/**
 * Created by miaomiao on 17-8-20.
 */
public class SortStackByStack {

    public void sortStack(Stack<Integer> stack){
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && cur > help.peek()) {
                stack.push(help.pop());
            }
                help.push(cur);
            }
        while (!help.isEmpty()){
            stack.push(help.pop());
            }
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        SortStackByStack sortStackByStack = new SortStackByStack();
        stack.push(1);
        stack.push(4);
        stack.push(7);
        stack.push(3);
        stack.push(8);

        sortStackByStack.sortStack(stack);

        do {
            System.out.println(stack.pop());
        }while (!stack.isEmpty());
    }
}
