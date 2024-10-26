package effectivejava;

import effectivejava.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("hello");
        System.out.println(stack.pop());
    }
}
