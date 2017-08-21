package cn.edu.swpu.cins.learnSomethings.dataStructure.stackQueue;

import java.util.Stack;

/**
 * 一个有getMin功能的栈
 * Created by miaomiao on 17-8-17.
 */
public class MyStack1 {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum){
        if(this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if(newNum <= this.getMin() ){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("your stack is empty!");
        }
        int value = this.stackData.pop();
        if(value == this.getMin()){
            this.stackMin.pop();
        }
        return value;

    }

    public int getMin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("your stack is empty!");
        }
        //查找堆栈中顶部元素
        int min = this.stackMin.peek();
        return min;
    }


    public static void main(String[] args){
        MyStack1 myStack1 = new MyStack1();
        myStack1.push(1);
        myStack1.push(7);
        myStack1.push(3);
        myStack1.push(0);

        System.out.println("min:"+myStack1.getMin());
        System.out.println(myStack1.pop());
        System.out.println("min:"+myStack1.getMin());
        System.out.println(myStack1.pop());
        myStack1.push(-2);
        System.out.println("min:"+myStack1.getMin());
        System.out.println(myStack1.pop());
        System.out.println("min:"+myStack1.getMin());
        System.out.println(myStack1.pop());
    }
}
