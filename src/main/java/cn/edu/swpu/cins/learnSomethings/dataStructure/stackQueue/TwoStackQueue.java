package cn.edu.swpu.cins.learnSomethings.dataStructure.stackQueue;

import java.util.Stack;

/**
 * Created by miaomiao on 17-8-17.
 */
public class TwoStackQueue {

    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue(){
        this.stackPush = new Stack<Integer>();
        this.stackPop = new Stack<Integer>();
    }

    public void add(int newNum){
        stackPush.push(newNum);
    }

    public int poll(){
        if(stackPush.isEmpty()&&stackPop.isEmpty()){
            throw new RuntimeException("Queue is empty!");
        }else if(stackPop.isEmpty()){
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek(){
        if(stackPush.isEmpty()&&stackPop.isEmpty()){
            throw new RuntimeException("Queue is empty!");
        }else if(stackPop.isEmpty()){
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    public static void main(String[] args){
        TwoStackQueue twoStackQueue = new TwoStackQueue();
        twoStackQueue.add(1);
        twoStackQueue.add(7);
        System.out.println(twoStackQueue.poll());
        twoStackQueue.add(3);
        System.out.println(twoStackQueue.peek());
        twoStackQueue.add(0);
        System.out.println(twoStackQueue.poll());
        System.out.println(twoStackQueue.peek());
    }

}
