package com.learn.newlearn1;


import java.util.Stack;

class DoubleStackQueue<T>{

    Stack<T> newStack, oldStack;
    DoubleStackQueue(){
        newStack = new Stack<>();
        oldStack = new Stack<>();
    }
    public int size(){
        return newStack.size() + oldStack.size();
    }

    public void add(T data){
        newStack.push(data);
    }

    public void shiftData(){
        while(!newStack.isEmpty()){
            oldStack.push(newStack.pop());
        }
    }

    public T pop(){
        shiftData();
        return oldStack.pop();
    }

    public T peek(){
        shiftData();
        return oldStack.peek();
    }
}

public class PlayGround {

    public static void main(String[] args) {
        DoubleStackQueue<Integer> qu = new DoubleStackQueue<>();

        qu.newStack.add(1);
        qu.newStack.add(2);
        qu.newStack.add(3);
        qu.newStack.add(4);
        System.out.println(qu.pop());
        System.out.println(qu.peek());
    }
}
