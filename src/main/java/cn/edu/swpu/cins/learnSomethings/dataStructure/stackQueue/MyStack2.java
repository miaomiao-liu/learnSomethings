package cn.edu.swpu.cins.learnSomethings.dataStructure.stackQueue;

import java.util.Stack;

/**
 * Created by miaomiao on 17-8-17.
 */
public class MyStack2 {
    private Stack<Integer> stackDate;
    private Stack<Integer> stackMin;

    public MyStack2(){
        this.stackDate = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum){
        if(this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if (newNum <= this.getMin()){
            this.stackMin.push(newNum);
        }else {
            this.stackMin.push(this.getMin());
        }

        this.stackDate.push(newNum);
    }

    public int pop(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("your stack is empty!");
        }
        int value = this.stackDate.pop();
        this.stackMin.pop();
        return value;
    }

    public int getMin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("your stack is empty!");
        }
        return this.stackMin.peek();
    }

    public static void main(String[] args){
        MyStack2 myStack2 = new MyStack2();
        myStack2.push(1);
        myStack2.push(7);
        myStack2.push(3);
        myStack2.push(0);

        System.out.println("min:"+myStack2.getMin());
        System.out.println(myStack2.pop());
        System.out.println("min:"+myStack2.getMin());
        System.out.println(myStack2.pop());
        myStack2.push(-2);
        System.out.println("min:"+myStack2.getMin());
        System.out.println(myStack2.pop());
        System.out.println("min:"+myStack2.getMin());
        System.out.println(myStack2.pop());
    }
}
