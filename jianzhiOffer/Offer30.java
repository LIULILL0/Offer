package jianzhiOffer;

import java.util.Stack;

public class Offer30 {
    //存放数据的
    Stack<Integer> DataStack = new Stack<>();
    //存放最小值的
    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        DataStack.push(node);
        if (!minStack.isEmpty()) {
            int c = minStack.peek();
            if (c > node) {
                minStack.push(node);
            } else {
                minStack.push(c);
            }
        } else {
            minStack.push(node);
        }
    }

    public void pop() {
        if (!DataStack.isEmpty()) {
            DataStack.pop();
            minStack.pop();
        }
    }

    public int top() {
        if (!DataStack.isEmpty()) {
            return DataStack.peek();
        }
        return 0;

    }

    public int min() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        } else {
            throw new IllegalArgumentException("参数不合法");
        }
    }
}
