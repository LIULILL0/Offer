package jianzhiOffer;

import java.util.Stack;

public class Offer31 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA == null || popA == null || popA.length != pushA.length)
            return false;
        Stack<Integer> stack = new Stack<>();
        int j=0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[j]) {
               stack.pop();
               j++;
            }
        }

        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[]pushA = {1,2,3,4,5};
        int[]popA = {4,5,3,2,1};
        System.out.println(new Offer31().IsPopOrder(pushA,popA));
    }
}
