package effectivejava;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private int INITIAL_CAPACITY = 16;
    private Object stack[];
    private int size = 0;

    public Stack() {
        stack = new Object[INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        stack[size] = e;
        size ++;
    }

    public Object pop() {
        if(size ==0) {
            throw new EmptyStackException();
        }
        else {
            Object o = stack[--size];
            stack[size] = null; // Eliminate obsolete reference
            return o;
        }
    }

    private void ensureCapacity() {
        if(stack.length == size) {
            stack = Arrays.copyOf(stack, 2 * size +1);
        }
    }

}
