package jianzhiOffer;

import java.util.Stack;

public class Offer9 {
    //进站
    Stack<Integer> stack1 = new Stack<Integer>();
    //出站
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        if (stack2.isEmpty()) {
            if (!stack1.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        } else
            return stack2.pop();

        return stack2.pop();
    }
}
