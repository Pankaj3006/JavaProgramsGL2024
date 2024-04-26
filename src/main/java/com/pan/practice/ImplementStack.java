package com.pan.practice;

public class ImplementStack {

    int top;
    int size;
    int[] arr;

    ImplementStack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return this.top==-1;
    }

    public boolean isFull() {
        return (size-1==top);
    }

    public int peek() {
        if(!this.isEmpty()) {
            return arr[top];
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void push(int element) {
        if(!this.isFull()) {
            top++;
            arr[top] = element;
            System.out.println(element + " pushed into Stack");
        }
        else {
            System.out.println("Stack is Full");
        }
    }

    public int pop() {
        if(!this.isEmpty()) {
            int popElement = arr[top];
            top--;
            return popElement;
        }
        else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public static void main(String[] args) {
        ImplementStack implementStack = new ImplementStack(3);
        System.out.println(implementStack.isEmpty());
        implementStack.push(100);
        implementStack.push(200);
        implementStack.push(300);
        System.out.println(implementStack.top);
        implementStack.push(200);
        System.out.println(implementStack.isFull());
        System.out.println("popped element: " + implementStack.pop());
        System.out.println("popped element: " + implementStack.pop());
        System.out.println(implementStack.top);
        System.out.println(implementStack.peek());
        System.out.println(implementStack.top);
        System.out.println(implementStack.peek());
    }

}
